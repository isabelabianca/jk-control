package br.com.fiap.model;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

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
	private LocalDate dataCadastro = LocalDate.now();
	private String imagePath;
	
	public User () {}
	
	
	public User(String id, String nome, LocalDate dataNascimento, String cpf, String rg, String digitoRg,
			LocalDate dataCadastro, String imagePath) {
		super();
		this.id = id;
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.cpf = cpf;
		this.rg = rg;
		this.digitoRg = digitoRg;
		this.dataCadastro = dataCadastro;
		this.imagePath = imagePath;
	}
	
	public String getId() {
		return id;
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


	public LocalDate getDataCadastro() {
		return dataCadastro;
	}

	@Override
	public String toString() {
		return "Visitante [name=" + nome +
				", data nascimento=" + dataNascimento + 
				", cpf=" + cpf +
				", rg=" + rg +
				", digito rg=" + digitoRg +
				", data cadastro=" + dataCadastro +"]";
	}

	public String getImagePath() {
		return imagePath;
	}

	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}

}
