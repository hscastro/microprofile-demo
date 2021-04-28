package com.hscastro.services;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;

import com.hscastro.entities.Pessoa;

@ApplicationScoped
public class PessoaServiceImpl implements PessoaService{
	
	private List<Pessoa> list = new ArrayList<>();

	public PessoaServiceImpl() {
		Pessoa pessoa1 = new Pessoa("Halyson Santos", "halisonsc5@gmail.com");
		Pessoa  pessoa2 = new Pessoa("Pedro Lucas", "p.lucas@gmail.com");
		Pessoa  pessoa3 = new Pessoa("Emanuela", "emanuelaalmeid7@gmail.com");
		list.add(pessoa1);
		list.add(pessoa2);
		list.add(pessoa3);
	}	
	
	public List<Pessoa> findAll(){
		return list;
	}
	

}
