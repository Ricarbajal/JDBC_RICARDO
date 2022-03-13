package com.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import com.entitys.Empleado;
import com.general.Database;
import com.general.Metodos;

public class EmpleadoDAO implements Metodos{
	
	Connection con = null;
	PreparedStatement pst = null;
	Database db = new Database();
	ResultSet rs = null;
	String resultado = null;
	Empleado e = null;
	
	@Override
	public String guardar(Object ob) {
		// Casteo a un tipo especifico
		Empleado e = (Empleado) ob;
		String query = "INSERT INTO EMPLEADO VALUES(?,?,?,?,?,?,?)";
		
		try {
			Class.forName(db.getDriver());
			con = DriverManager.getConnection(db.getUrl(), db.getUsuario(), 
					db.getPassword());
			pst = con.prepareStatement(query);
			
			pst.setInt(1, e.getEmpleado_Id());
			pst.setString(2, e.getNombre());
			pst.setInt(3, e.getAntiguedad());
			pst.setString(4, e.getSexo());
			pst.setString(5, e.getEstadoCivil());
			pst.setDate(6, e.getFechaNac());
			pst.setInt(7, e.getCargoId());
			
			int flag = pst.executeUpdate();
			
			if(flag > 0) {
				resultado = "1";
				System.out.println("Se ha guardado un nuevo empleado");
			}else {
				resultado = "0";
				System.out.println("Se ha presentado un error");
			}
			
		} catch (Exception ex) {
			resultado = ex.getMessage();
		}
		return resultado;
	}
	
	@Override
	public String editar(Object ob) {
		Empleado e = (Empleado) ob;
		String query = "UPDATE EMPLEADO SET NOMBRE = ?, ANTIGUEDAD = ?,SEXO = ?,ESTADO_CIVIL = ?,FECHA_NAC = ?, CARGO_ID = ? WHERE EMPLEADO_ID = ?";
		
		try {
			Class.forName(db.getDriver());
			con = DriverManager.getConnection(db.getUrl(), db.getUsuario(), 
					db.getPassword());
			pst = con.prepareStatement(query);
			
			pst.setString(1, e.getNombre());
			pst.setInt(2, e.getAntiguedad());
			pst.setString(3, e.getSexo());
			pst.setString(4, e.getEstadoCivil());
			pst.setDate(5, e.getFechaNac());
			pst.setInt(6, e.getCargoId());
			pst.setInt(7, e.getEmpleado_Id()); 
			int flag = pst.executeUpdate();
			
			if(flag > 0) {
				resultado = "1";
				System.out.println("Se ha modificado un nuevo empleado");
			}else {
				resultado = "0";
				System.out.println("Se ha presentado un error");
			}
			
		} catch (Exception ex) {
			resultado = ex.getMessage();
		}
		return resultado;
	}
	
	@Override
	public String eliminar(int id) {
		String query ="DELETE FROM EMPLEADO WHERE EMPLEADO_ID = ?";
		try {
			Class.forName(db.getDriver());
			con = DriverManager.getConnection(db.getUrl(),
			db.getUsuario(), db.getPassword());
			
			pst =con.prepareStatement(query);
			pst.setInt(1, id);
			int flag = pst.executeUpdate();
			
			if(flag > 0) {
				resultado = "1";
				System.out.println("Se ha borrado un empleado");
			}else {
				resultado = "0";
				System.out.println("Se ha presentado un error");
			}
			
		} catch (Exception e) {
			System.out.println("Id no econtrado");
		}
		return resultado;
	}
	
	@Override
	public Object buscar(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List mostrar() {
		
		List<Empleado> list = new ArrayList<Empleado>();
		String query="SELECT * FROM EMPLEADO";
		try {
			Class.forName(db.getDriver());
			con = DriverManager.getConnection(db.getUrl(),
			db.getUsuario(), db.getPassword());
			
			pst =con.prepareStatement(query);
			rs=pst.executeQuery();
			
			while (rs.next()) {
						e =new Empleado (rs.getInt("EMPLEADO_ID"),
						rs.getString("NOMBRE"), 
						rs.getInt("ANTIGUEDAD"), 
						rs.getString("SEXO"), 
						rs.getString("ESTADO_CIVIL"),
						rs.getDate("FECHA_NAC"),
						rs.getInt("CARGO_ID"));
				
				//agrago el objeto empledo con la informacion ala lista
				list.add(e);
				
			}
			
		} catch (Exception ex) {
			System.out.println("error al listar los elementos:  "+ex.getMessage());
		}
		return list;
		
	}
	

}
