package palindromo;

/*	Programa identificador de palindromo (Palindromo)
 * Por: Joaquim Rafael Mariano Prieto Pereira TIA: 42201731
 * Consulta em materias de sala: Exemplo Java - Classe Estudante, POO - Conceitos básicos, classes e objetos 
 * (material do prof. Dr. Ivan Carlos Alcântara de Oliveira), Programação de Computadores (versão "Java 101")
 * e Tipos de dados
 */

public class Palindromo {
	
	private String texto;
	
	public Palindromo () {
		this("");
	}
	
	public Palindromo (String texto) {
		this.texto = texto;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}
	
	public boolean verifica() {
		
		texto = texto.replaceAll("\\s","");
		texto = texto.toLowerCase();
		char[] array =  texto.toCharArray();
		
		int i= 0, j = texto.length()-1;
		
		while(i<j) {
			if(array[i]!= array[j]) {return false;}
			i++;
			j--;
		}
		
		return true;
		
	}
}
