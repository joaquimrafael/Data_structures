package palindromo;

/*	Programa identificador de palindromo (main)
 * Por: Joaquim Rafael Mariano Prieto Pereira TIA: 42201731
 * Consulta em materias de sala: Exemplo Java - Classe Estudante, POO - Conceitos básicos, classes e objetos 
 * (material do prof. Dr. Ivan Carlos Alcântara de Oliveira), Programação de Computadores (versão "Java 101")
 * e Tipos de dados
 */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Palindromo palindromos = new Palindromo();
		Scanner input = new Scanner(System.in);
			
		String frase, sair = "/sair";
			
		while(true) {
			
			System.out.print("Digite uma frase para descobrir se é palindroma (digite /sair para encerrar): ");
			frase = input.nextLine();
			
			if(frase.equals(sair)) {break;}
			
			palindromos.setTexto(frase);
			
			if(palindromos.verifica()) {System.out.println("A palavra é palindroma!");}
			else {System.out.println("A palavra não é palindroma");}
		}
		
		input.close();
	}

}
