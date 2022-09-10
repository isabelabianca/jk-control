package br.com.fiap.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String id;
	private String nome;
	private LocalDate dataNascimento;
	private String cpf;
	private String rg;
	private String digitoRg;
	private String rua;
	private String numeroCasa;
	private String cep;
	
	public User (){}

	public User(String id, String nome, LocalDate dataNascimento, String cpf, String rg, String digitoRg, String rua,
			String numeroCasa, String cep) {
		this.id = id;
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.cpf = cpf;
		this.rg = rg;
		this.digitoRg = digitoRg;
		this.rua = rua;
		this.numeroCasa = numeroCasa;
		this.cep = cep;
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public LocalDate getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getRg() {
		return rg;
	}
	
	public void setRg(String rg) {
		this.rg = rg;
	}
	
	public String getDigitoRg() {
		return digitoRg;
	}
	
	public void setDigitoRg(String digitoRg) {
		this.digitoRg = digitoRg;
	}
	
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	
	public String getNumeroCasa() {
		return numeroCasa;
	}
	public void setNumeroCasa(String numeroCasa) {
		this.numeroCasa = numeroCasa;
	}
	
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	

	@Override
	public String toString() {
		return "User [id=" + id + ", nome=" + nome + ", dataNascimento=" + dataNascimento + ", cpf=" + cpf + ", rg="
				+ rg + ", digitoRg=" + digitoRg + ", rua=" + rua + ", numeroCasa=" + numeroCasa + ", cep=" + cep + "]";
	}
	
	

}	