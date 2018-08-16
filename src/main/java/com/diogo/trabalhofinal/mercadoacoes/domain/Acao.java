package com.diogo.trabalhofinal.mercadoacoes.domain;

import java.util.Date;
import org.springframework.lang.Nullable;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Acao {
	
	private Long id;
	private Long idEmpresa;
	private float valor;
	
	@Nullable
	private Date dataCompra;
	@Nullable
	private Long idCliente;
	
}
