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

public class LinkedList {
	//variaveis da lista encapsuladas
	private int count;// contador de elementos
	private Node head;// primeiro elemento da lista
	private Node tail;// ultimo elemento da lista
	
	//Create
	public LinkedList() {
		count = 0;
		head = null;
		tail = null;
	}
	
	//verifica se a lista esta vazia
	public boolean isEmpty() {
		return (this.head == null);
	}
	//obtem o primeiro nó que possui o elemento procurado
	public Node getNode(int element)  {
		if(this.isEmpty()) {return null;}
		
		Node aux = head;
		//loop percorre toda a lista
		while(aux != null) {
			if(aux.getData() == element) {return aux;} // se encontrar o elemento e um nó retorna o numero da posição
			else { aux = aux.getNext(); }
		}
		return null; // se não encontrar retorna null simbolizando que está fora da lista
	}
	
	//insere um elemento no começo da lista
	public void insert(int element) {
		//cria um novo nó que aponta para o head e atualiza a referencia de head
		Node newNode = new Node(element, head);
		head = newNode;
		// verifica se a lista estava vazia antes, e se sim, atribui a tail o node de head(lista de um nó)
		if(tail == null) {
			tail = head;
		}
		count++;
	}
	//insere um elemento no final da lista
	public void append(int element) {
		// cria um novo nó com o parametro passado
		Node newNode = new Node(element);
		// verifica se a lista estava vazia
		if(this.isEmpty()) {//se estiver inicializa head e tail para o novo nó
			head = newNode;
			tail = newNode;
		}else {// senão aponta tail para o novo ultimo nó e atualiza a referencia de tail
		tail.setNext(newNode);
		tail = newNode;
		}
		count++;
		
	}
	//remove o primeiro elemento da lista
	public Node removeHead()  {
		if(this.isEmpty()) {return null;}//verifica se esta vazia
		//cria um nó auxiliar que recebe head, então atualiza head para o proximo nó, e apaga a referencia ao proximo do antigo head(aux)
		Node aux = head;
		head = head.getNext();
		aux.setNext(null);
		
		if(head == null) {// se a lista tiuer um unico elemento(head e tail iguais), remove a refencia de tail também
			tail = null;
		}
		count--;
		return aux;
	}
	//remove o ultimo elemento da lista
	public Node removeTail()  {
		if(this.isEmpty()) {return null;}//verifica se esta vazia
		
		Node removed;
		Node aux = head;
		//utiliza 2 variaveis para chegar ao penultimo elemento da lista e retornar o ultimo(removido)
		if(head == tail) {//verifica se é uma lista de 1 elemento
			removed = head;
			head = null;
			tail = null;
		}else {//percorre ate o penultimo elemento
			while(aux.getNext().getNext() != null) {
				aux = aux.getNext();
			}
			//atualiza tail para o penultimo e apaga sua refencia para o antigo ultimo
		removed = tail;
		aux.setNext(null);
		tail = aux;
		tail.setNext(null);
		}
		count--;
		return removed;
	}
	// remove o nó que tem como data o valor passado como parametro
	public Node removeNode(int element) {
        if (isEmpty()) {//verifica se esta vazia
            return null;
        }
        //se estiver na primeira chama o metodo removehead()
        if (head.getData() == element) {
            return this.removeHead();
        }
        
        //utiliza 2 variavies do tipo node para percorrer ate a posição do nó desejado e a anterior
        Node anterior = head;
        Node atual = head.getNext();
        while (atual != null) {
            if (atual.getData() == element) {
                anterior.setNext(atual.getNext());
                atual.setNext(null);
                count--;
                return atual;
                //se encontrar,faz o anterior ao removido apontar para o proximo(pulando o nó removido), e apaga a referencia ao proximo do nó retornado
            }
            anterior = atual;
            atual = atual.getNext();
        }
        return null;// se o parametro passado não corresponde a nenhum elemento da lista, retorna null
    }
	

	// limpa totalmente da memoria a lista encadeada, apagando os dados dos nodes e suas refencias ao proximo
	public void clear() {
		while (head != null) {
			Node aux = this.head;
			head.setNext(null);
			head = aux.getNext();
			aux = null;
		}
		head = null;
		tail = null;
		count = 0;
	}

	// na linguagem Java, destroy tem a mesma função de clear
	public void destroy(){
		
		while (head != null) {
			Node aux = this.head;
			head.setNext(null);
			head = aux.getNext();
			aux = null;
		}
		head = null;
		tail = null;
		count = 0;
	}
	// retorna o primeiro nó da lista
	public Node getHead(){
		if(this.isEmpty()) {return null;}
		
		return head;
	}
	// retorna o ultimo nó da lista
	public Node getTail(){
		if(this.isEmpty()) {return null;}
		
		return tail;
	}
	// retorna o numero de elementos
	public int count() {return this.count;}
	
	
	

	
	

}
