package lab2a;

/*	Aplicação Lista Encadeada
 * Por: Joaquim Rafael Mariano Prieto Pereira TIA: 42201731
 * 
 * Consulta em: https://dev.to/ccunha/listas-encadeadas-157
 * https://gist.github.com/marvinferreira/598a1a3295dfa80755325ea325b5c076
 *  e materias de sala:
 *  Exemplo Java - TAD Lista simplesmente encadeada/ligada, POO - Conceitos básicos, classes e objetos 
 *  (material do prof. Dr. Ivan Carlos Alcântara de Oliveira), Programação de Computadores (versão "Java 101")
 * e Tipos de dados
 */

//Classe de criação dos nós de cada lista
public class Node {
	//variaveis encapsuladas
	private int data;//guarda as informações do nó
	private Node next;// aponta para o nó seguinte da lista encadeada
	
	public Node(int data) {// cria um nó apenas passando o valor
		this(data,null);
	}
	
	public Node(int data, Node next) {// cria um nó passando o valor e o proximo elemento
		this.data = data;
		this.next = next;
	}
	// getters e setters das variaveis da classe
	public int getData() { return data; }

	public void setData(int data) { this.data = data; }

	public Node getNext() { return next; }

	public void setNext(Node next) { this.next = next; }

}
