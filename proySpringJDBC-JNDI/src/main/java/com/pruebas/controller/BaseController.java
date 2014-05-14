package com.pruebas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.pruebas.dto.Pruebas;
 
 
@Controller 
public class BaseController {
 
	private String texto;
	
	
	@RequestMapping("/muestra")
	public String welcome(Model model) {
 
		Pruebas pru = new Pruebas();
		pru.setMensaje("este mensaje xD");
		
		model.addAttribute("pruebas", pru);
//		texto = "iiiie";
//		model.addAttribute("texto", "vvvv");
		//Spring uses InternalResourceViewResolver and return back index.jsp
		return "prueba/index2";
 
	}
 
	@RequestMapping(value="/welcome/{name}", method = RequestMethod.GET)
	public String welcomeName(@PathVariable String name, ModelMap model) {
 
		model.addAttribute("message", "Maven Web Project + Spring 3 MVC - " + name);
		return "index";
 
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}
 
}