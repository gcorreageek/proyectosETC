package com.haribon.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.haribon.model.Area;
import com.haribon.repository.AreaDAO;
import com.haribon.repository.CargoDAO;
import com.haribon.repository.MySqlJdbcAreaDAO;
import com.haribon.service.PruebaService;
import com.pruebas.dto.Pruebas;

@Controller
public class Inicio {
	private final Log log = LogFactory.getLog(getClass());
	
	@Autowired
	private AreaDAO areaDao;
	
	@RequestMapping("/inicio.html"  )
	@SuppressWarnings("unused") 
	public String inicio() { 
//		Pruebas pru = new Pruebas();
//		pru.setMensaje("este mensaje xD"); 
//		model.addAttribute("pruebas", pru); 
//		model.addAttribute("texto", "vvvv");
		//Spring uses InternalResourceViewResolver and return back index.jsp
//		/WEB-INF/views/plantilla/template.jsp
		log.info("prueba");
		log.error("prueba");
		return "plantilla/body"; 
	}
 
	@RequestMapping("/prueba")
	public String welcome2(Model model) {  
		log.info("prueba");
		
//		PruebaService prueee = new PruebaService();
//		Pruebas p = new Pruebas();
//		p.setMensaje("Este bbb");
//		prueee.guardaPruebas(p);
//		System.out.println("depsues");
//		System.out.println("hay k mirar esto:"+p.getUsuario());
		
		
		Area a = new Area();
		a.setCodArea(111);
		a.setDescArea("Area nueva2!");
		//Nota: La etiqueta @Repository, funcionara siempre y cuando se llame atraves de un @Autowired a una
		//instancia de esta clase, si se llama por medio de una instancia del tipo 'Clase a = new Clase()' no
		//funcionara.
//		AreaDAO daoArea = new MySqlJdbcAreaDAO();
		areaDao.insertarArea(a);
		
		
		 
		return "prueba/prueba";
 
	}

	 

 
	
	
}
