package br.corp.isidrocorp.projeto.dao;

import org.springframework.data.repository.CrudRepository;

import br.corp.isidrocorp.projeto.model.Conta;

public interface ContaDao extends CrudRepository<Conta,Integer>{

}
