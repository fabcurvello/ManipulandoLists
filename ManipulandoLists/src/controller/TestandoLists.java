package controller;

import java.util.ArrayList;
import java.util.List;

import model.Pessoa;
import util.Teclado;

public class TestandoLists {
	
	private static List<Pessoa> pessoas = new ArrayList<Pessoa>();;

	public static void main(String[] args) {
		
		int quantidade = Teclado.lerInt("Quantas pessoas deseja cadastrar? ");
		
		for ( int contador = 1; contador <= quantidade ; contador++) {
			pessoas.add(cadastrarPessoa(contador));
		}
		
		System.out.println("\n" + quantidade + " pessoas cadastradas!");
		
		exibirPessoasCadastradas();
	
	}
	
	public static Pessoa cadastrarPessoa(int contador) {
		System.out.println("\nCadastro de Pessoa Número " + contador);
		String nome = Teclado.lerTexto("Nome: ");
		String sexo = Teclado.lerTexto("Sexo: ");
		int idade = Teclado.lerInt("Idade: ");
		
		Pessoa pessoa = new Pessoa(nome, sexo, idade);
		return pessoa;
	}
	
	public static void exibirPessoasCadastradas() {
		System.out.println("\nRelação de pessoas cadastradas: ");
		for ( Pessoa pessoa: pessoas ) {
			System.out.println("Nome: " + pessoa.getNome() + " - Sexo: " + pessoa.getSexo() + " - Idade: " + pessoa.getIdade());
		}
	}

}
