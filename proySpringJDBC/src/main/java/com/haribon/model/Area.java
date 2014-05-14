package com.haribon.model;

import java.io.Serializable;

public class Area extends TodoObjeto implements Serializable  {
 
	private static final long serialVersionUID = -7784163343897390669L;
	private Integer codArea;
	private String descArea;
//	private Object objecto;
	public Integer getCodArea() {
		return codArea;
	}
	public void setCodArea(Integer codArea) {
		this.codArea = codArea;
	}
	public String getDescArea() {
		return descArea;
	}
	public void setDescArea(String descArea) {
		this.descArea = descArea;
	}
//	public Object getObjecto() {
//		return objecto;
//	}
//	public void setObjecto(Object objecto) {
//		this.objecto = objecto;
//	}
	
}
