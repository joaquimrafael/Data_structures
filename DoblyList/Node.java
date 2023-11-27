package lab2b;

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
	private int id;
	private String name;
	private Node previous; //aponta para o nó anterior da lista encadeada
	private Node next;// aponta para o nó seguinte da lista encadeada
	
	public Node(int id, String name) {// cria um nó apenas passando o valor
		this(id,name,null,null);
	}
	
	public Node(int id,String name, Node previous, Node next) {// cria um nó passando o valor e o proximo elemento
		this.id = id;
		this.name = name;
		this.next = next;
		this.previous = previous;
	}
	// getters e setters das variaveis da classe
	public int getId() { return id; }

	public void setId(int id) { this.id = id; }

	public Node getNext() { return next; }

	public void setNext(Node next) { this.next = next; }

	public Node getPrevious() { return previous; }

	public void setPrevious(Node previous) { this.previous = previous; }

	public String getName() { return name; }

	public void setName(String name) { this.name = name; }
	
	@Override
	public String toString() {
		return (previous == null ? "null" : previous.getId()) + " <- prev(id)" 
				+ ", id: " + id + ", name: " + name
				+ ", next(id) -> " + (next == null ? "null" : next.getId());
	}
	
	
}
