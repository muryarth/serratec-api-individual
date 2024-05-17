package org.serratec.api.individual.controller;

import java.util.List;
import java.util.Optional;

import org.serratec.api.individual.model.Livro;
import org.serratec.api.individual.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/livros")
public class LivroController {

	@Autowired
	private LivroRepository livroRepository;

	@GetMapping
	public ResponseEntity<List<Livro>> listar() {
		return ResponseEntity.ok(livroRepository.findAll());
	}

	@GetMapping("/{id}")
	public ResponseEntity<Livro> buscarPorId(@PathVariable Long id) {
		Optional<Livro> livroOpt = livroRepository.findById(id);

		if (livroOpt.isEmpty()) {
			return ResponseEntity.notFound().build();
		}

		return ResponseEntity.ok(livroOpt.get());
	}

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Livro inserir(@Valid @RequestBody Livro livro) {
		return livroRepository.save(livro);
	}

	@PutMapping("/{id}")
	public ResponseEntity<Livro> atualizar(@PathVariable Long id, @Valid @RequestBody Livro livro) {
		if (livroRepository.existsById(id)){
			livro.setId(id);
			livro = livroRepository.save(livro);
			return ResponseEntity.ok(livro);
		}

		return ResponseEntity.notFound().build();
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> remover(@PathVariable Long id) {
		if (livroRepository.existsById(id)) {
			livroRepository.deleteById(id);
			return ResponseEntity.noContent().build();
		}
		return ResponseEntity.notFound().build();
	}
}
