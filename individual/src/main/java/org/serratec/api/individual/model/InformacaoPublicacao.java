package org.serratec.api.individual.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.NotNull;

@Embeddable
public class InformacaoPublicacao {

	@NotNull(message = "Não pode ser nulo")
	@Column(name = "editora", nullable = false, length = 20)
	private String editora;

	@NotNull(message = "Não pode ser nulo")
	@Column(name = "autor", nullable = false, length = 20)
	private String autor;

	@Column(name = "data_publicacao")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
	private Date dataPublicacao;	

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public Date getDataPublicacao() {
		return dataPublicacao;
	}

	public void setDataPublicacao(Date dataPublicacao) {
		this.dataPublicacao = dataPublicacao;
	}
}
