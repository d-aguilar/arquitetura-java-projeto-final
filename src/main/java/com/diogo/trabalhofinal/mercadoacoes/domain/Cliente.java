package com.diogo.trabalhofinal.mercadoacoes.domain;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Document
public class Cliente {
	@Id
	private Long id;
	private Long nome;
	
	@DBRef
	private List<Acao> acoes;
}
