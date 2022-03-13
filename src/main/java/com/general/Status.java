package com.general;

public class Status {
	
	Object ob;
	String mensaje, respuesta;
	
	public Status() {

	}
	
	public Status(Object ob, String mensaje, String respuesta) {
		this.ob = ob;
		this.mensaje = mensaje;
		this.respuesta = respuesta;
	}
	
	/**
	 * @return the ob
	 */
	public Object getOb() {
		return ob;
	}

	/**
	 * @param ob the ob to set
	 */
	public void setOb(Object ob) {
		this.ob = ob;
	}

	/**
	 * @return the mensaje
	 */
	public String getMensaje() {
		return mensaje;
	}

	/**
	 * @param mensaje the mensaje to set
	 */
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	/**
	 * @return the respuesta
	 */
	public String getRespuesta() {
		return respuesta;
	}

	/**
	 * @param respuesta the respuesta to set
	 */
	public void setRespuesta(String respuesta) {
		this.respuesta = respuesta;
	}
	
	@Override
	public String toString() {
		return "Status [ob=" + ob + ", mensaje=" + mensaje + ", respuesta=" + respuesta + "]\n";
	}

}
