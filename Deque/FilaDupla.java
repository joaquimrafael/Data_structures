
public class FilaDupla {

	private static final int CAPACIDADE_PADRAO = 16;
	private char dados[];
	private int primeiro;
	private int contador;
	private int ultimo;
	
	private int erro;
	public int getErro() { return erro; }
	
	public FilaDupla() {
		this(CAPACIDADE_PADRAO);
	}

	public FilaDupla(int capacidade) {
		dados = new char[capacidade];
		primeiro = 0;
		contador = 0;
		ultimo = 0;
	}
	
	
	public char frente() {
		erro = 0;
		
		if (contador == 0) {
			erro = 2;
			return '\0';
		}
		
		return dados[primeiro];
	}
	
	public char costas() {
		erro = 0;
		
		if (contador == 0) {
			erro = 2;
			return '\0';
		}
		
		int capacidade = dados.length;
		int ultimoCorrigido = (ultimo - 1 + capacidade) % capacidade;
		return dados[ultimoCorrigido];
	}
	
	
	public void inserirInicio(char valor) {
		erro = 0;
		
		// Fila está cheia.
		if (contador >= dados.length) {
			erro = 1;
			return;
		}
		
//		--primeiro;
//		if (primeiro < 0) {
//			primeiro = dados.length - 1;
//		}
		
		// A linha abaixo equivale ao código comentado acima.
		primeiro = (primeiro - 1 + dados.length) % dados.length;
		
		dados[primeiro] = valor;
		
		++contador;
	}
	
	public void inserirFinal(char valor) {
		erro = 0;
		
		// Fila está cheia.
		if (contador >= dados.length) {
//			throw new RuntimeException("Fila cheia, impossível inserir '" + valor + "'.");
			erro = 1;
			return;
		}
		
		dados[ultimo] = valor;
		
//		++ultimo;
//		if (ultimo >= dados.length) {
//			ultimo = 0;
//		}
		
		// A linha abaixo equivale ao código comentado acima.
		ultimo = (ultimo + 1) % dados.length;
		
		++contador;
	}
	
	public char removerFinal() {
		erro = 0;
		
		// Fila está vazia.
		if (contador == 0) {
			erro = 2;
			return '\0';
		}
		
		ultimo = (ultimo - 1 + dados.length) % dados.length;
		char valor = dados[ultimo];
		dados[ultimo] = '\0';
		--contador;
		
		return valor;		
	}
	
	public char removerInicio() {
		erro = 0;
		
		// Fila está vazia.
		if (contador == 0) {
			erro = 2;
			return '\0';
		}
		
		primeiro = (primeiro + 1) % dados.length;
		char valor = dados[primeiro];
		dados[primeiro] = '\0';
		--contador;
		
		return valor;		
	}
	
	public boolean isEmpty() {
		if(contador == 0) {return true;}
		else {return false;}
	}
	
	public boolean isFull() {
		if(contador == dados.length) {return true;}
		else {return false;}
	}
	
	public int Size() {
		return dados.length;
	}
	
	public int Count() {return contador;}
	
	public void clear() {
		for(int i = 0; i < dados.length; i++) {
			dados[i] = '\0';
		}
		primeiro = 0;
		contador = 0;
		ultimo = 0;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		if(ultimo <= primeiro) {
			for(int i = primeiro; i< dados.length;++i) 
				sb.append("[" + dados[i] + "]");
			for(int i = 0; i < ultimo; ++i)
				sb.append("[" + dados[i] + "]");
		}else {
			for(int i = primeiro; i<ultimo;++i)
				sb.append("[" + dados[i] + "]");
		}
		
		
		return sb.toString();
	}

}









