package ifrn.pi.eventos.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EventosController {
	
	@RequestMapping("/eventos/form")
	public String form() {
		return "formEvento";
	}
	
	@PostMapping("/eventos")
	public String adicionar(String nome) {
		
		System.out.println("O nome: " + nome);
		
		return "evento-adicionado";
	}

}
