
public class Main {

	public static void main(String[] args) {
		String str = "abcdefghijklmnopqrstuvxyzw";
		
		FilaDupla f = new FilaDupla();
		
		char frente = f.frente();
		if (f.getErro() == 2) {
			System.out.println("Fila vazia.");
		}
		
		for (int i = 0; i < str.length(); i += 2) {
//			try {
//				f.inserir(str.charAt(i));
//			} catch(RuntimeException e) {
//				System.out.println("Fila cheia, não foi possível inserir " + str.charAt(i));
//				break;
//			}
			
			f.inserirInicio(str.charAt(i));
			if (f.getErro() == 1) {
				System.out.println("Não foi possível inserir " + str.charAt(i) + " no início da fila.");
				break;
			}
			f.inserirFinal(str.charAt(i + 1));
			if (f.getErro() == 1) {
				System.out.println("Não foi possível inserir " + str.charAt(i + 1) + " no final da fila.");
				break;
			}
		}

		char costas = f.costas();
		
		//System.out.println(frente);
		System.out.println(costas);
		

		char removido = f.removerFinal();
		System.out.println("Valor removido: " + removido);
		System.out.println(f);

		removido = f.removerInicio();
		System.out.println("Valor removido: " + removido);
		System.out.println(f);
		
		f.clear();
		System.out.println(f);

	}

}
