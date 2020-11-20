package com.alanlima.cursospring.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alanlima.cursospring.domain.Cidade;
import com.alanlima.cursospring.repositories.CidadeRepository;

@Service
public class CidadeService {

	@Autowired
	private CidadeRepository repo;
	
	public List<Cidade> findAll(Integer estadoId){
		return repo.findCidades(estadoId);
	}
}
