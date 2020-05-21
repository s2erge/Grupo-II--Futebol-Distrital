package com.as.futebol;

import com.as.futebol.utilidades.*;
import java.util.*;

public class Treinador extends Pessoa {

    // =======================================================
    // ===================== ATRIBUTOS =======================
    // =======================================================

	private List<Habilitacao> habilitacao = new ArrayList<Habilitacao>();;

    // =======================================================
    // ============ ACESSORES e MODIFICADORES ================
    // =======================================================

	public List<Habilitacao> getHabilitacao() {
		return habilitacao;
	} //getHabilitacao;

	public void setHabilitacao(int index, Habilitacao habilitacao) {
		this.habilitacao.set(index, habilitacao);
	} //setHabilitacao;
	
	public void addHabilitacao(Habilitacao habilitacao) {
		this.habilitacao.add(habilitacao);
	} //addHabilitacao;

    // =======================================================
    // =================== CONSTRUTORES ======================
    // =======================================================

	public Treinador () {
		
	} //Construtor Treinador;
	
	//Construtor com parametros;
	public Treinador(String nome, Date dataNascimento, int contacto, String email, int numeroCartaoCidadao, Habilitacao habilitacao) {
		super.setNome(nome);
		super.setDataNascimento(dataNascimento);
		super.setEmail(email);
		super.setContacto(contacto);
		super.setNumeroCartaoCidadao(numeroCartaoCidadao);
		this.habilitacao.add(habilitacao);
	} //Construtor Treinador;

    // =======================================================
    // =================== .COMPORTAMENTOS ===================
    // =======================================================

	public String MostrarInformacao () {
		String result = "";
		
		result += "Nome: " + super.getNome() + "\n";
		result += "Email: " + super.getEmail() + "\n";
		result += "Contacto: " + super.getContacto() + "\n";
		result += "Data Nascimento: " + super.getDataNascimento() + "\n";
		result += "Cart�o Cidad�o: " + super.getNumeroCartaoCidadao() + "\n\n";
		
		result += "Habilitacao:\n";
		for (Habilitacao h : habilitacao) {
			result += h.MostrarInformacao();
		}
		
		result += "\n\n";
		
		return result;
		
	} //MostrarInformacao;

    // =======================================================
    // ============== M�TODOS COMPLEMENTARES =================
    // =======================================================

    // ----> toString()

    // ----> equals()
	
} //Class Treinador;





































