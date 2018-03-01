package com.algaworks.socialbook.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LivrosResource {

	@RequestMapping(value="/livros", method = RequestMethod.GET)
	public String listar() {
		return "Rest aplicado, Git-Git Passo-a-Passo";
	}
}
