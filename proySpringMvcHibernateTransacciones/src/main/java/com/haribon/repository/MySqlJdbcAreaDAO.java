package com.haribon.repository;
 

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.haribon.model.Area;

//Nota: La etiqueta @Repository, funcionara siempre y cuando se llame atraves de un @Autowired a una
//instancia de esta clase, si se llama por medio de una instancia del tipo 'Clase a = new Clase()' no
//funcionara.
@Repository
public class MySqlJdbcAreaDAO  implements AreaDAO {
	private final Log log = LogFactory.getLog(getClass()); 
	
//	org.springframework.orm.hibernate3.annotation.AnnotationSessionFactoryBean dd; 
//	org.springframework.orm.hibernate4.LocalSessionFactoryBean eeee;
//	org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean ee;
	
//	org.springframework.orm.hibernate3.HibernateTransactionManager t ;
//	org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean e;
//	org.springframework.orm.hibernate4.HibernateTransactionManager d;
//	@PersistenceContext
//	private EntityManager em;
	
	@Autowired
	private SessionFactory sessi;
	 
	 
	@Override
	public Area insertarArea(Area a) { 
//		d.getClass()
//		EntityManager ss = (EntityManager) ee;
//		ss.
//		EntityManager se = (EntityManager) dd; 
//		dd.getdata
		log.debug("here insert dao area"); 
//		 dd.getc
//		em.persist(a);
		Session session = sessi.getCurrentSession();
		session.persist(a);
//		String sql = "INSERT INTO TB_AREA " +
//				"(COD_AREA, DESC_AREA) VALUES (?, ?)";
//		t.update(sql,null,a.getDescArea());
		log.debug("codigo:"+a.getCodArea());// no setea el codigo!
		return a;
	}

	 
 
}
