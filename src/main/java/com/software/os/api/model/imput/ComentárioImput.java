package com.software.os.api.model.imput;

import javax.validation.constraints.NotBlank;

public class ComentárioImput {
	
	@NotBlank
	private String descricao;

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}
