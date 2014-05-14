package com.haribon.repository;

import javax.sql.DataSource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import com.haribon.model.Area;

//Nota: La etiqueta @Repository, funcionara siempre y cuando se llame atraves de un @Autowired a una
//instancia de esta clase, si se llama por medio de una instancia del tipo 'Clase a = new Clase()' no
//funcionara.
@Repository
public class MySqlJdbcAreaDAO  implements AreaDAO {
	private final Log log = LogFactory.getLog(getClass());
	
	@Autowired
	private JdbcTemplate t; 
	 
	@Override
	public Area insertarArea(Area a) {
		log.debug("here insert dao area"); 

		String sql = "INSERT INTO TB_AREA " +
				"(COD_AREA, DESC_AREA) VALUES (?, ?)";
		t.update(sql,null,a.getDescArea());
		log.debug("codigo:"+a.getCodArea());// no setea el codigo!
		return a;
	}

 
}
