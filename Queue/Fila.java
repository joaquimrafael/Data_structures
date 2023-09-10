package lab1d;

/*	Programa organizador de tarefas com uso de Fila (class)
 * Por: Joaquim Rafael Mariano Prieto Pereira TIA: 42201731
 * 
 * Consulta em: https://linguagensdeprogramacao.wordpress.com/2011/07/16/fila-java/
 * https://blog.betrybe.com/java/switch-case-java/
 *  e materias de sala:
 *  Exemplo Java - Classe Estudante, POO - Conceitos básicos, classes e objetos, Minizine Fila
 * (material do prof. Dr. Ivan Carlos Alcântara de Oliveira), Programação de Computadores (versão "Java 101")
 * e Tipos de dados
 */

public class Fila {
	
	private int first;
	private int count;
	private int last;
	
	private String queue[];
	
	private static final int max_size = 16;
	
	public Fila() {
		this(max_size);
	}
	
	public Fila(int size) {
		this.first = 0;
		this.count = 0;
		this.last = 0;
		
		this.queue = new String[size];
	}
	
	public boolean isEmpty() {
		if(count == 0) {return true;}
		else {return false;}
	}
	
	public void enqueue(String str) {
		
		if(count>=queue.length) {
			System.out.println("Fila cheia, impossivel inserir tarefa");
		}else {
			queue[last] = str;
			last = (last + 1) % queue.length;
			count++;
		}
	}
	
	public String dequeue() {
		if(isEmpty()) {
			System.out.println("Fila vazia, impossivel remover tarefa"); return null;}
		else {
			String front = queue[first];
			queue[first] = null;
			first = (first + 1)% queue.length;
			--count;
			return front;
		}
	}
	
	public String front() {
		if(isEmpty()) {return null;}
		else{return queue[first];}
	}
	
	public boolean isFull() {
		if(count>=queue.length) {return true;}
		else {return false;}
	}
	
	public int size() {
		return queue.length;
	}
	
	public int count() {
		return count;
	}
	
	public void clear() {
		first = 0;
		count = 0;
		last = 0;
	}


}
