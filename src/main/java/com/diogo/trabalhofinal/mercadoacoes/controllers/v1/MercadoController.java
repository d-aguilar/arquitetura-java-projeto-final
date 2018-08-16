package com.diogo.trabalhofinal.mercadoacoes.controllers.v1;

import java.util.Set;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.diogo.trabalhofinal.mercadoacoes.domain.Acao;
import com.diogo.trabalhofinal.mercadoacoes.services.IMercadoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api("API de Mercado")
@RestController
@RequestMapping(MercadoController.BASE_URL)
public class MercadoController {
	
	public static final String BASE_URL = "/api/v1/mercado";
	private final IMercadoService _mercadoService;
	
	public MercadoController(IMercadoService mercadoService){
		this._mercadoService = mercadoService;
	}
	
	@ApiOperation(value = "Comprar ações")
	@PostMapping
	@ResponseStatus(HttpStatus.OK)
	public Set<Acao> comprarAcoes(@RequestBody Long idCliente, @RequestBody Long idEmpresa, @RequestBody int quantidadeAcoes){
		Set<Acao> acoes = _mercadoService.comprarAcoes(idCliente, idEmpresa, quantidadeAcoes);
		return acoes;
	}
	
	@ApiOperation(value = "Vender ações")
	@PostMapping
	@ResponseStatus(HttpStatus.OK)
	public void venderAcoes(@RequestBody Long idCliente, @RequestBody Long idEmpresa, @RequestBody int quantidadeAcoes){
		_mercadoService.venderAcoes(idCliente, idEmpresa, quantidadeAcoes);
	}
	
}
