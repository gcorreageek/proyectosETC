package com.haribon.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pruebas.dto.Pruebas;

@Controller
public class Inicio {
	private final Log log = LogFactory.getLog(getClass());
	
	@RequestMapping("/inicio.html"  )
	@SuppressWarnings("unused")
//	@Action(value="/login",results={
//			@Result(name="success",type="tiles",location="d_index"),
//			@Result(name="error",location="/paginas/seguridad/login.jsp"),
//			@Result(name="movilsalida",type="tiles",location="d_maininformeinternosalida"),
//			@Result(name="movilentrada",type="tiles",location="d_maininformeinternoentrada"),
//	})
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
		log.error("prueba");
		return "prueba/prueba";
 
	}
	
	
}
