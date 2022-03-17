package br.com.viagem.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.viagem.model.Destinos;
import br.com.viagem.repository.DestinosRepository;



@Service
public class DestinosService {
	
	@Autowired
	private DestinosRepository repository;
	
	public Destinos findById(Long id) {
		Optional<Destinos> destinos = repository.findById(id);
		return destinos.orElseThrow();
	}
	
	public List<Destinos> findAll () {
		return repository.findAll();
	}
	
	public Destinos save(Destinos destinos) {
		destinos.setId(null);
		return repository.save(destinos); 
	}
	
	public Destinos update(Destinos destinos) {
		Destinos newDestinos = findById(destinos.getId());
		 updateDestinos(destinos, newDestinos);
		return repository.save(newDestinos);
	}

	public void delete(Long id) {
		repository.deleteById(id);
	}
	
	public void updateDestinos(Destinos oldDestinos, Destinos newDestinos) {
		
		newDestinos.setNome(oldDestinos.getNome());
		newDestinos.setUrl(oldDestinos.getUrl());
		newDestinos.setPreco(oldDestinos.getPreco());	
		
	}
	
}
