package com.general;

public class Database {
	
	private String driver;
	private String url;
	private String usuario; 
	private String password;
	
	public Database()
	{
		this.driver = "oracle.jdbc.OracleDriver";
		this.url = "jdbc:oracle:thin:@localhost:1521:xe";
		this.usuario = "ricar";
		this.password = "admin";
	}
	
	public String getDriver() {
		return driver;
	}
	public void setDriver(String driver) {
		this.driver = driver;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

}
