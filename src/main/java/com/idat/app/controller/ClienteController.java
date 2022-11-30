package com.idat.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.idat.app.modelo.Cliente;
import com.idat.app.service.ClienteService;


@Controller
@RequestMapping("api/cliente")
public class ClienteController {


	@Autowired
	private ClienteService service;
	
	@PostMapping("/guardar")
	public @ResponseBody void guardar(@RequestBody Cliente cliente) {
		service.guardarcliente(cliente);
	}
	
	@GetMapping("/asignar")
	public @ResponseBody void asignar() {
		service.asignarclienteHospital();
	}
}
