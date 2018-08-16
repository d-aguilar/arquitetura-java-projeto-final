package com.diogo.trabalhofinal.mercadoacoes.repositories;

import java.util.Date;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.diogo.trabalhofinal.mercadoacoes.domain.Acao;

public interface IAcaoRepository extends MongoRepository<Acao, Long> {

	public Acao obterAcoesPorEmpresa(long idEmpresa);
	public Acao comprarAcao(long idEmpresa, long idCliente, long idAcao, Date dataCompra);
	public Acao venderAcao(long idEmpresa, long idCliente, long idAcao);
}
