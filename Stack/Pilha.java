package ativ1c;

/*	Programa identificador de  corrêspondencia de simbolos (Pilha)
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
 */

public class Pilha {
	
	//Criação da pilha e da variavel de posicionamento
	public Object[] pilha;
	public int pos;
	
	//Construtores
	public Pilha() {
		this.pos = -1;
		this.pilha = new Object[130];
	}
	
	public Pilha(int tamanho) {
		this.pos = -1;
		this.pilha = new Object[tamanho];
	}
	
	//Verifica se esta vazia
	public boolean isEmpty() {
		if(pos == -1) {return true;}
		else {return false;}
	}
	
	//Retorna o tamanho
	public int size() {
		if(isEmpty()) {return 0;}
		else {return pos + 1;}
	}
	
	//Retorna o contador
	public int count() {return pos+1;}
	
	//Verifica se esta vazia
	public boolean isFull() {
		if(pilha.length == pos+1) {return true;}
		else {return false;}
	}
	
	//Limpa a pilha
	public void clear() {pos = -1;}
	
	
	//Mostra o topo da pilha
	public Object top() {
		if(isEmpty()) {return null;}
		else {return pilha[pos];}
	}
	
	//Insere um Objeto no topo da pilha
	public void push(Object valor) {
		if (!this.isFull()) {
            this.pilha[++pos] = valor;
	}else {System.out.println("A pilha esta lotada...");}
	}
	
	//Retira um objeto do topo da pilha
	public Object pop() {
		if (isEmpty()) {
			System.out.println("A pilha esta vazia...");
            return null;
        }
        return this.pilha[this.pos--];
	}
	

}
