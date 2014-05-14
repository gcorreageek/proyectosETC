package com.haribon.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.haribon.model.Area;

//Nota: La etiqueta @Repository, funcionara siempre y cuando se llame atraves de un @Autowired a una
//instancia de esta clase, si se llama por medio de una instancia del tipo 'Clase a = new Clase()' no
//funcionara.
@Repository
public class MySqlJdbcAreaDAO implements AreaDAO {
	private final Log log = LogFactory.getLog(getClass());
	
	@Autowired
	private DataSource dataSource; 
	
//	private JdbcTemplate jdbcTemplate;
//	
//	@Autowired
//	public void setDataSource(DataSource dataSource) {
//		this.jdbcTemplate = new JdbcTemplate(dataSource);
//	}
	
	@Override
	public Area insertarArea(Area a) {
		log.debug("here insert dao area"); 
		String sql = "INSERT INTO TB_AREA " +
				"(COD_AREA, DESC_AREA) VALUES (?, ?)";
		Connection conn = null;
 
		try {
			conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, a.getCodArea());
			ps.setString(2, a.getDescArea()); 
			ps.executeUpdate();
			ps.close(); 
		} catch (SQLException e) {
			throw new RuntimeException(e); 
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {}
			}
		} 
		return a;
	}


//	public DataSource getDataSource() {
//		return dataSource;
//	} 
//	public void setDataSource(DataSource dataSource) {
//		this.dataSource = dataSource;
//	}

}
