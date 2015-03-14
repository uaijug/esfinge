package com.uaijug.afd.esfinge.repository;

import com.uaijug.afd.esfinge.domain.Candidato;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;



@Repository
public class HomeRepository {

	private List<Candidato> candidatos = new ArrayList<>();

	public void setCandidatos(List<Candidato> candidatos) {
		this.candidatos = candidatos;
	}

	 /**
	  * Acha um candidato pelo cpf
	  * @param cpf
	  * @return
	  */
	public Candidato findByCpf(String cpf) {

		for (Candidato candidato : this.candidatos) {
			if (candidato.getCpf().equals(cpf)) {
				return candidato;
			}
		}

		return null;
	}

}
