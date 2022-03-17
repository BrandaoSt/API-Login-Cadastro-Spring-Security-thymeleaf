package br.com.viagem.web.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.viagem.repository.DestinosRepository;

	@RestController
	@RequestMapping({"/destinos"})
	public class DestinosController {

		private DestinosRepository repository;

		   DestinosController(DestinosRepository destinosRepository) {
		       this.repository = destinosRepository;
		   }
	   
	   
}