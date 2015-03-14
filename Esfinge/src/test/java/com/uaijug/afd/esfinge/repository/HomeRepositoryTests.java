package com.uaijug.afd.esfinge.repository;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.uaijug.afd.esfinge.domain.Candidato;


public class HomeRepositoryTests {

	private HomeRepository homeRepository;

	@Before
	public void setUp() {
		this.homeRepository = new HomeRepository();
		Candidato joao = new Candidato();
		joao.setNome("Joao");
		joao.setCpf("1234");

		Candidato maria = new Candidato();
		maria.setNome("Maria");
		maria.setCpf("5678");

		List<Candidato> candidatos = new ArrayList<>();
		candidatos.add(joao);
		candidatos.add(maria);

		this.homeRepository.setCandidatos(candidatos);

	}

	@Test
	public void FindByCpf() {
		String cpf = "1234";

		Candidato c = this.homeRepository.findByCpf(cpf);
		Assert.assertEquals("Joao", c.getNome());
	}



}
