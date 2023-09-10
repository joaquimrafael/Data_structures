package ativ1c;

/*	Programa identificador de  corrêspondencia de simbolos (main)
 * Por: Joaquim Rafael Mariano Prieto Pereira TIA: 42201731
 * 
 * Consulta em: https://www.devmedia.com.br/pilhas-fundamentos-e-implementacao-da-estrutura-em-java/28241,
 *  https://www.ime.usp.br/~pf/estruturas-de-dados/aulas/stack.html 
 *  https://cursos.alura.com.br/forum/topico-como-sei-quando-devo-usar-o-this-165033#:~:
 *  text=Resumindo%3A%20Precisamos%20utilizar%20o%20this,da%20classe%20dentro%20do%20método.
 *  https://www.devmedia.com.br/forum/stack-pilha-em-java/585708
 *  e materias de sala:
 *  Exemplo Java - Classe Estudante, POO - Conceitos básicos, classes e objetos, Minizine Pilha
 * (material do prof. Dr. Ivan Carlos Alcântara de Oliveira), Programação de Computadores (versão "Java 101")
 * e Tipos de dados
 * 
 */


import java.util.Scanner;

public class Main {
	
	public static boolean verificador(String txt) {
		String esquerda = "([{<";
		String direita = ")]}>";
		Pilha p1 = new Pilha(txt.length());
		
		int i;
		
		for(i=txt.length()-1;i>=0;i--) {
			
			if(esquerda.indexOf(txt.charAt(i))!=-1 && p1.isEmpty()) {return(false);}
			
			if(direita.indexOf(txt.charAt(i))!=-1) {p1.push(txt.charAt(i));}

			if(esquerda.indexOf(txt.charAt(i))!=-1) {
				if((esquerda.indexOf(txt.charAt(i)) != direita.indexOf((char)p1.top()))){return(false);}
				
				else{p1.pop();}
			}
			
		}
		
		if(!p1.isEmpty()) {return false;}
		return true;
	}
	

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite um texto a ser verificado: ");
		String txt = input.nextLine();
		
		boolean verifica = verificador(txt);
		if(verifica) {System.out.println("Tudo certo, expressão OK");}
		else {System.out.println("Infelizmente ocorreu um erro de corrêspondencia");}
		
		
		input.close();
		
	}

}
