package lab1d;

/*	Programa organizador de tarefas com uso de Fila (main)
 * Por: Joaquim Rafael Mariano Prieto Pereira TIA: 42201731
 * 
 * Consulta em: https://linguagensdeprogramacao.wordpress.com/2011/07/16/fila-java/
 * https://blog.betrybe.com/java/switch-case-java/
 *  e materias de sala:
 *  Exemplo Java - Classe Estudante, POO - Conceitos básicos, classes e objetos, Minizine Fila
 * (material do prof. Dr. Ivan Carlos Alcântara de Oliveira), Programação de Computadores (versão "Java 101")
 * e Tipos de dados
 */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Fila tarefas = new Fila(10);
		Scanner input = new Scanner(System.in);
		Scanner read = new Scanner(System.in);
		String tarefa_atual = "<nenhuma>";
		boolean cond = true;
		
		while(cond) {
			
			System.out.println();
			System.out.println("*** CONTROLE DE TAREFAS ***");
			System.out.println("1 - Iniciar a proxima tarefa da fila");
			System.out.println("2 - Inserir uma tarefa na fila");
			System.out.println("3 - Verificar qual é a proxima tarefa na fila");
			System.out.println("4 - Exibir quantas tarefas ainda faltam fazer");
			System.out.println("5 - Remover todas as tarefas da fila");
			System.out.println("6 - Sair");
			System.out.println("Tarefa atual: " + tarefa_atual);
			System.out.println();
			System.out.print("Escolha uma opção: ");
			int escolha = input.nextInt();
			
			switch (escolha) {
			
				case 1:
					if(tarefas.isEmpty()) {
					System.out.println("*** Não há tarefas na fila!!");}
					else {tarefa_atual = tarefas.dequeue();}
					continue;
				
				
				case 2:
					System.out.print(">>>Descreva a nova tarefa: ");
					String proxima_tarefa = read.nextLine();
					tarefas.enqueue(proxima_tarefa);
					continue;
				
				case 3:
					System.out.println(">>> A próxima tarefa na fila é: ");
					if(tarefas.isEmpty()) {
						System.out.println("*** Não há tarefas na fila!!");}
					else {System.out.println(tarefas.front());}
					continue;
				
				case 4:
					System.out.printf(">>> Tarefas a fazer: %d", tarefas.count());
					continue;
				
				case 5:
					tarefas.clear();
					System.out.println(">>> Todas as tarefas foram removidas da fila!");
					continue;
				
				case 6:
					System.out.println("Fim.");
					cond = false;
					continue;
				
				default:
				System.out.println("*** Opção inválida!");
			}
		}
	}
}
