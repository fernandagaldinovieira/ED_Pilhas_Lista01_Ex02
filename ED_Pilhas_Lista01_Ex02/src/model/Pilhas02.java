package model;

public class Pilhas02 {

	No02 topo;
	
	public Pilhas02() {
		topo = null;
	}
	
	public boolean isEmpty() {
		if (topo == null) {
			return true;
		}
		return false;
	}
	
	public void push(int valor) {
		No02 elemento = new No02();
		elemento.dado = valor;
		elemento.proximo = topo;
		topo = elemento;
	}
	
	public int pop() throws Exception {
		if (isEmpty()) {
			throw new Exception("Pilha vazia");
		}
		
		int valor = topo.dado;
		topo = topo.proximo;
		return valor;
	}
	
}





