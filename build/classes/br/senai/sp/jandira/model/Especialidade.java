package br.senai.sp.jandira.model;

public class Especialidade {
	// privado
	// não deixamos
	private String nome;
	private String descricao;
	//private static int quantidade;
	
	public String getNome() {
		return nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}


	// método de acesso getters and setters acessar os atributos
	// não diretamente
	// setando o nome
	// setNome void (para não retornar) usar para pegar o nome e guardar no atributo
	// nome
	// set será sempre void
	// guardar a variavel que vai receber o nome
	// quando chma o setNome tenho que passar uma string para ele
	// criando o método set, para pegar do ClinicaApp.java "cardiologia" e guardar
	// no String "nome", que está em público


	// criando o get nome retornando uma string
	// prescisamos pegar o nome
	// metodo para retornar, então string



}
