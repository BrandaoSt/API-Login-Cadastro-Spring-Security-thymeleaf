package br.com.viagem.service;

import java.util.List;

import org.springframework.security.core.userdetails.UserDetailsService;

import br.com.viagem.model.User;
import br.com.viagem.web.dto.UserRegistrationDto;


public interface UserService extends UserDetailsService{
	User save(UserRegistrationDto registrationDto);
	List<User> getAll();
}


