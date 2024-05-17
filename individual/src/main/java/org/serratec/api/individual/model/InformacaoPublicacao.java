package org.serratec.api.individual.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.validation.constraints.Past;

@Embeddable
public class InformacaoPublicacao {

	@Column(name = "autor", nullable = false, length = 20)
	private String editora;

	@Column(name = "autor", nullable = false, length = 20)
	private String autor;

	@Column(name = "data_publicacao", columnDefinition = "DATE")
	@Temporal(TemporalType.DATE)
	@Past(message = "*dataPublicacao* deve ser anterior à data atual para o Embeddable *informacaoPublicacao*")
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
