package com.software.os.api.model.imput;

import javax.validation.constraints.NotNull;

public class ClienteIdImput {
	
	@NotNull
	private Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
}
