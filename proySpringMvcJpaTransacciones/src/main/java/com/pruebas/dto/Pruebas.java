package com.pruebas.dto;

import java.io.Serializable;

public class Pruebas implements Serializable { 
 
	private String usuario;
	private String mensaje ;

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	
	
}
