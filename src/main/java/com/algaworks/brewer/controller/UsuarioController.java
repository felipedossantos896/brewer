package com.algaworks.brewer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/usuarios")
public class UsuarioController {

	@RequestMapping("/novo")
	public String novo() {
		return "/usuario/CadastroUsuario.html";
	}
	
}
