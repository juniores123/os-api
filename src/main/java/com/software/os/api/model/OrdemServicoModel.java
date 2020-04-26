package com.software.os.api.model;

import java.math.BigDecimal;
import java.time.OffsetDateTime;

import com.software.os.domain.model.StatusOrdemServico;

public class OrdemServicoModel {
	
	private Long id;
	private ClienteResumoModel cliente;
	private String descricacao;
	private BigDecimal preco;
	private StatusOrdemServico status;
	private OffsetDateTime dataAbertura;
	private OffsetDateTime dataFinalizacao;
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}

	public ClienteResumoModel getCliente() {
		return cliente;
	}

	public void setCliente(ClienteResumoModel cliente) {
		this.cliente = cliente;
	}

	public String getDescricacao() {
		return descricacao;
	}

	public void setDescricacao(String descricacao) {
		this.descricacao = descricacao;
	}

	public String getDescricao() {
		return descricacao;
	}
	
	public void setDescricao(String descricao) {
		this.descricacao = descricao;
	}
	
	public BigDecimal getPreco() {
		return preco;
	}
	
	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}
	
	public StatusOrdemServico getStatus() {
		return status;
	}
	
	public void setStatus(StatusOrdemServico status) {
		this.status = status;
	}
	
	public OffsetDateTime getDataAbertura() {
		return dataAbertura;
	}
	
	public void setDataAbertura(OffsetDateTime dataAbertura) {
		this.dataAbertura = dataAbertura;
	}
	
	public OffsetDateTime getDataFinalizacao() {
		return dataFinalizacao;
	}
	
	public void setDataFinalizacao(OffsetDateTime dataFinalizacao) {
		this.dataFinalizacao = dataFinalizacao;
	}
}
