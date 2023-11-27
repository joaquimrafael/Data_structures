package lab2b;

public class Main {
	
		 public static void print(DoblyList list) {
			 Node aux = list.getHead();
			 
			 System.out.println("Lista com " + list.count() + " elementos: ");
			 
			 do {
				 System.out.println(" ["+ aux.getId() + "] " + aux.getName());
				 aux = aux.getNext();
				 
			 }while(aux != list.getHead());
		 }
		 
		 public static void printReverse(DoblyList list){
			 Node aux = list.getTail();
			 System.out.println("Lista com " + list.count() + " elementos - invertida: ");
			 
			 do {
				 System.out.println(" ["+ aux.getId() + "] " + aux.getName());
				 aux = aux.getPrevious();
				 
			 }while(aux != list.getTail());
		 }
		 
		 public static void printListInfo(DoblyList list){
			 if (list.isEmpty()) {
				 System.out.println("Lista vazia!");

			 } else {
				 print(list);
				 printReverse(list);
				 System.out.println();
			 }
		}
		 
		 
		 public static void main(String[] args) {
		 System.out.println("*** Lista Circular Duplamente Encadeada/Ligada ***");
		 DoblyList list = new DoblyList();
		 printListInfo(list);
		 
		 list.insert(1, "Carol");
		 list.insert(2, "Eric");
		 list.insert(3, "John");
		 list.append(4, "Leo");
		 list.append(5, "Julia");
		 list.append(6, "Lisa");
		 printListInfo(list);


		 list.clear();
		 printListInfo(list);
		 
		 list.insert(11, "Paulo");
		 list.append(22, "Thomas");
		 list.insert(33, "Olga");
		 list.append(44, "Bia");
		 list.insert(55, "Angela");
		 list.append(66, "Karen");
		 list.insert(77, "Adauto");
		 printListInfo(list);
		 

		 Node temp = list.removeNode(44);
		 if(temp == null) {System.out.println("Nenhum nó foi removido.");}
		 else {
			 System.out.println("Nó removido -> id: " + temp.getId() + ", name: " + temp.getName());
		 }
		 printListInfo(list);
		 
		 temp = list.removeHead();
		 if(temp == null) {System.out.println("Nenhum nó foi removido.");}
		 else {
			 System.out.println("Nó removido -> id: " + temp.getId() + ", name: " + temp.getName());
		 }
		 printListInfo(list);
		 
		 temp = list.removeTail();
		 if(temp == null) {System.out.println("Nenhum nó foi removido.");}
		 else {
			 System.out.println("Nó removido -> id: " + temp.getId() + ", name: " + temp.getName());
		 }
		 printListInfo(list);
		 
		 if(list.isEmpty()) {System.out.println("Lista vazia, nenhum nó...");
		 
		 }else {
			 Node head = list.getHead();
			 System.out.println("Primeiro nó -> id: " + head.getId() + ", name: " + head.getName());
			 
			 Node tail = list.getTail();
			 System.out.println("Ultimo nó -> id: " + tail.getId() + ", name: " + tail.getName());
			 
			 temp = list.getNode(77);
			 
			 
			 if(temp == null) 
			 {System.out.println("Não existe no com esse valor na lista");
			 
			 } else {System.out.println("O nó de valor "+temp.getId()+" obtido! Nome: " + temp.getName());}
		 }
		 System.out.println();
		 System.out.println("Fim.");
		 }
}


