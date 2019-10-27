public class AppPilha {
	public static void main(String[] args) {
		PilhaDinamica pilha = new PilhaDinamica();

		pilha.push(5);
		pilha.exibir();
		System.out.println("Topo: " + pilha.peek());
		pilha.push(1);
		pilha.exibir();
		System.out.println("Topo: " + pilha.peek());
		pilha.push(16);
		pilha.exibir();
		System.out.println("Topo: " + pilha.peek());
		pilha.push(2);
		pilha.exibir();
		System.out.println("Topo: " + pilha.peek());
		System.out.println("Removendo " + pilha.pop());
		pilha.exibir();
		System.out.println("Topo: " + pilha.peek());
		System.out.println("Removendo " + pilha.pop());
		pilha.exibir();
		System.out.println("Topo: " + pilha.peek());
	}
}