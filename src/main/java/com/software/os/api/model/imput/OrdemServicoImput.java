package com.software.os.api.model.imput;

import java.math.BigDecimal;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class OrdemServicoImput {
	
	@NotBlank
	private String descricacao;
	
	@NotNull
	private BigDecimal preco;
	
	@Valid
	@NotNull
	private ClienteIdImput cliente;
	
	public String getDescricacao() {
		return descricacao;
	}
	
	public void setDescricacao(String descricacao) {
		this.descricacao = descricacao;
	}
	
	public BigDecimal getPreco() {
		return preco;
	}
	
	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}
	
	public ClienteIdImput getCliente() {
		return cliente;
	}
	
	public void setCliente(ClienteIdImput cliente) {
		this.cliente = cliente;
	}
}
