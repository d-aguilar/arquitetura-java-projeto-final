package com.diogo.trabalhofinal.mercadoacoes.services;

import java.util.Set;

import com.diogo.trabalhofinal.mercadoacoes.domain.Acao;

public interface IMercadoService {
	
	Set<Acao> obterTodasAcoes();
	Set<Acao> comprarAcoes(Long idCliente, Long idEmpresa, int quantidadeAcoes);
	void venderAcoes(Long idCliente, Long idEmpresa, int quantidadeAcoes);
	
}
