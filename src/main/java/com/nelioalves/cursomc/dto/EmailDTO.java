package com.nelioalves.cursomc.dto;

import java.io.Serializable;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

public class EmailDTO implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@NotEmpty(message="Prenchimento obrigatório")
	@Length(min=5, max=80, message="O tamanho deve ter entre 5 e 80 caracteres")
	private String email;
	
	public EmailDTO() {
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	

}
