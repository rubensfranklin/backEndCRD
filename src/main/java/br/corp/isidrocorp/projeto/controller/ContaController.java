package br.corp.isidrocorp.projeto.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.corp.isidrocorp.projeto.dao.ContaDao;
import br.corp.isidrocorp.projeto.model.Conta;

import lombok.AllArgsConstructor;


@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@AllArgsConstructor

public class ContaController {

	@Autowired
	private ContaDao dao;
	@GetMapping("/contas")

	public ArrayList<Conta> recuperarTudo() {

		ArrayList<Conta> lista;
		lista = (ArrayList<Conta>) dao.findAll();
		return lista;
	}

	@GetMapping("/contas/{numero}")

	public Conta recuperarConta(@PathVariable int numero) {
		return dao.findById(numero).orElse(null);
	}
	
	@PostMapping("/contas")
	public void saveConta(@RequestBody Conta conta) {
		dao.save(conta);
	}
	
	@DeleteMapping("/contas")
	public void excluirConta(@RequestBody Conta conta) {
		dao.delete(conta);
	}
	}

