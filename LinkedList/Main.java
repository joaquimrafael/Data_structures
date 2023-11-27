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

public class Main {
	
	public static void printListInfo(LinkedList list) {
		 if (list.isEmpty()) {
		 System.out.println("Lista vazia!");
		 } else {
			 Node aux = list.getHead();
			 
			 System.out.print("Lista com " + list.count() + " elementos: ");
			 while(aux != null) {
				 System.out.print(aux.getData() + " ");
				 aux = aux.getNext();
			 }
			 System.out.println();
		 }
	}


	public static void main(String[] args) {
		
		System.out.println("*** Lista Ligada/Encadeada (Linked List) ***");
		 LinkedList list = new LinkedList();
		 
		 printListInfo(list);
		 
		 list.insert(1);
		 list.insert(2);
		 list.insert(3);
		 list.append(4);
		 list.append(5);
		 list.append(6);
		 
		 printListInfo(list);
		 
		 list.clear();
		 
		 printListInfo(list);
		 
		 list.insert(77);
		 list.append(88);
		 list.insert(99);
		 list.append(3);
		 list.insert(2);
		 list.append(1);
		 list.insert(0);
		 
		 printListInfo(list);
		 
		 Node temp = list.removeNode(3);
		 if (temp != null) {
			    System.out.println("Nó removido: " + temp.getData());
			} else {
			    System.out.println("Nenhum nó foi removido.");
			}
		 printListInfo(list);
		 
		 temp = list.removeHead();
		 if (temp != null) {
			    System.out.println("Nó removido: " + temp.getData());
			} else {
			    System.out.println("Nenhum nó foi removido.");
			}
		 printListInfo(list);
		 
		 temp = list.removeTail();
		 if (temp != null) {
			    System.out.println("Nó removido: " + temp.getData());
			} else {
			    System.out.println("Nenhum nó foi removido.");
			}
		 printListInfo(list);

		 if(list.isEmpty()) {System.out.println("Lista vazia, nenhum nó...");
		 
		 }else {
			 System.out.println("O primeiro nó é: "+ list.getHead().getData());

			 System.out.println("O ultimo nó é: "+ list.getTail().getData());

			 
			 Node receive = list.getNode(3);
			 
			 if(receive == null) {System.out.println("Não existe no com esse valor na lista");
			 
			 } else {System.out.println("O nó de valor "+receive.getData()+" obtido!");}
		 }
		 
		 System.out.println("Fim.");
	}

}
