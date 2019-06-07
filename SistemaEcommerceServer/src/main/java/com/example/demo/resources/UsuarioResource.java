package com.example.demo.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.Usuario;
import com.example.demo.repositories.UsuarioRepository;

@RestController
@RequestMapping(value="/usuarios")
@CrossOrigin(origins = "http://localhost:4200")
public class UsuarioResource {
		
	@Autowired
	private UsuarioRepository repo;

	@GetMapping
	public ResponseEntity<List<Usuario>> findAll() {
		List<Usuario> usuarios = repo.findAll();
		return ResponseEntity.ok().body(usuarios);
	}
		
}