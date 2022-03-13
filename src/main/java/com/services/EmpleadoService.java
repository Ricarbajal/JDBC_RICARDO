package com.services;

import java.util.List;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

import com.dao.EmpleadoDAO;
import com.entitys.Empleado;
import com.general.Status;

@Path("empleado/")
public class EmpleadoService {
	Empleado empleado = null;
	EmpleadoDAO eDao = null;
	
	//empleado/guardar
	
	@Path("guardar")
	@POST
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	public Status guardar(Empleado empleado) {
		Status s = new Status();
		//Inserto el objeto que estoy a punto de guardar 
		//dentro del objeto que me entrega el servidor 
		s.setOb(empleado);
		
		//llamo a una instancia del objeto DAO
		
		eDao = new EmpleadoDAO();
		
		//Invoco el metodo guardar del DAO y almaceno su respuesta en r
		String r = eDao.guardar(empleado);
		
		if(r.equals("1")) {
			s.setMensaje("Guardado exitosamente");
			s.setRespuesta(r);
		}else {
			s.setMensaje("No fue posible guardar");
			s.setRespuesta(r);
		}
		
		return s;		
	}
	
	//mostrar
		//empleado/guardar
			@Path("mostrar-todos")
			@GET
			@Produces({MediaType.APPLICATION_JSON})
		public List<Empleado> mostrartodos(){
			eDao = new EmpleadoDAO();
			
			return eDao.mostrar();
			
		}
	//eliminar
			//empleado/eliminar
			@Path("eliminar")
			@GET
			@Consumes({MediaType.APPLICATION_JSON})
		public String eliminarregistros() {
				eDao = new EmpleadoDAO();
				
				return eDao.eliminar(5);
						
			}
	//actualizar
			//empleado/eliminar
			@Path("actualizar")
			@PUT
			@Consumes({MediaType.APPLICATION_JSON})
			@Produces({MediaType.APPLICATION_JSON})
		public Status actualizar(Empleado empleado) {
				Status s = new Status();
				//Inserto el objeto que estoy a punto de guardar 
				//dentro del objeto que me entrega el servidor 
				s.setOb(empleado);
				
				//llamo a una instancia del objeto DAO
				
				eDao = new EmpleadoDAO();
				
				//Invoco el metodo guardar del DAO y almaceno su respuesta en r
				String r = eDao.editar(empleado);
				
				if(r.equals("1")) {
					s.setMensaje("Actualizado exitosamente");
					s.setRespuesta(r);
				}else {
					s.setMensaje("No fue posible actualizar");
					s.setRespuesta(r);
				}
				
				return s;	
			}
}
