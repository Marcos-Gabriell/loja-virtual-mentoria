package br.com.marcos.lojavirtual.model;



import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "pessioa_fisica")
@PrimaryKeyJoinColumn(name = "id")
public class PessoaFisica extends Pessoa{

	
	private static final long serialVersionUID = 1L;

	
	@Column(nullable = false)
	private String cpf;
	
	
	@Temporal(TemporalType.DATE)
	private Date dataNasciemneto;


	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	public Date getDataNasciemneto() {
		return dataNasciemneto;
	}


	public void setDataNasciemneto(Date dataNasciemneto) {
		this.dataNasciemneto = dataNasciemneto;
	}
	
	
}
