package com.iscloud.prueba.controller;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.iscloud.prueba.entidad.Archivo;

@Controller
public class ArchivoController {

	
	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	@GetMapping ("/archivo")
	public String archivo(Model model) throws FileNotFoundException, IOException {
		Archivo archivo = new Archivo().leerProperties();
		
		model.addAttribute("archivo", archivo);
		return "archivo";
	}
	
	
}
