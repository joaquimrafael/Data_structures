package lab2b;

public class DoblyList {
	//variaveis da lista encapsuladas
		private int count;// contador de elementos
		private Node head;// primeiro elemento da lista
		private Node tail;// ultimo elemento da lista
		
		//Create
		public DoblyList() {
			count = 0;
			head = null;
			tail = null;
		}
		
		//verifica se a lista esta vazia
		public boolean isEmpty() { return head == null; }
		
		
		//obtem o primeiro nó que possui o id procurado
		public Node getNode(int id)  {
			
			Node aux = head;
			
			do {
				if(aux.getId() == id) {
					return aux;
				} 
				aux = aux.getNext(); 
				
			} while(aux != head);
			
			return null; 
		}
		
		//insere um elemento no começo da lista
		public void insert(int id, String name) {
			Node newNode = new Node(id, name);
			if(head == null) {
				head = newNode;
				tail = newNode;
			}else {
				
				newNode.setNext(head);
				head.setPrevious(newNode);
				head = newNode;
			}
			head.setPrevious(tail);
			tail.setNext(head);
			count++;
		}
		//insere um elemento no final da lista
		public void append(int id, String name) {
			Node node = new Node(id, name);
			
			// Verifica se a lista está vazia.
			if (head == null) {
				head = node;
			} else {
				tail.setNext(node);
				node.setPrevious(tail);
			}
			
			tail = node;

			tail.setNext(head);
			head.setPrevious(tail);
			
			++count;
		}
		//remove o primeiro elemento da lista
		public Node removeHead()  {
			if(this.isEmpty()) {return null;}

			Node removed = head;
			head = head.getNext();
			
			head.setPrevious(tail);
			tail.setNext(head); 
			
			count--;
			
			if(count == 0) {
				tail = null; 
				head = null; 
			}
			
			
			removed.setNext(null);
			removed.setPrevious(null);
			
			return removed;
		}
		//remove o ultimo elemento da lista
		public Node removeTail()  {
			if(this.isEmpty()) {return null;}
			
			
			Node removed = tail;
			
			tail = tail.getPrevious();
			
			tail.setNext(head);
			head.setPrevious(tail);
			
			count--;
			
			if(count == 0) {
				head = null;
				tail = null;
			}
			
			removed.setNext(null);
			removed.setPrevious(null);
			
			return removed;
		
		}
		// remove o nó que tem como data o valor passado como parametro
		public Node removeNode(int id) {
	        if (isEmpty()) {//verifica se esta vazia
	            return null;
	        }
	        //se estiver na primeira chama o metodo removehead()
	        if (head.getId() == id) {
	            return this.removeHead();
	        }
	        
	        if (tail.getId() == id) {
	            return this.removeTail();
	        }
	        
	        //utiliza 2 variavies do tipo node para percorrer ate a posição do nó desejado e a anterior
	        Node removed = head;
	        
	        do {
	            if (removed.getId() == id) {
	            	
	                removed.getPrevious().setNext(removed.getNext());
	                removed.getNext().setPrevious(removed.getPrevious());
	                
	                count--;
	                
	                removed.setNext(null);
	                removed.setPrevious(null);
	                
	                return removed;

	            }
	            removed = removed.getNext();
	        }while(removed != head);
	        
	        
	        return null;// se o parametro passado não corresponde a nenhum elemento da lista, retorna null
	    }
		

		// limpa totalmente da memoria a lista encadeada, apagando os dados dos nodes e suas refencias ao proximo
		public void clear() {
		    if (head == null) {
		        return;
		    }

		    Node aux = head;
		    do {
		        Node next = aux.getNext();
		        aux.setNext(null);
		        aux.setPrevious(null);
		        aux = next;
		    } while (aux != head);

		    head = null;
		    tail = null;
		    count = 0;
		}
		
		// na linguagem Java, destroy tem a mesma função de clear
		public void Destroy() {
		    if (head == null) {
		        return;
		    }

		    Node aux = head;
		    do {
		        Node next = aux.getNext();
		        aux.setNext(null);
		        aux.setPrevious(null);
		        aux = next;
		    } while (aux != head);

		    head = null;
		    tail = null;
		    count = 0;
		}
		// retorna o primeiro nó da lista
		public Node getHead(){ return head; }
		
		// retorna o ultimo nó da lista
		public Node getTail(){ return tail; }
		
		// retorna o numero de elementos
		public int count() {return this.count;}
}
