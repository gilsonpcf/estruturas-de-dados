public class AppFila {
	public static void main(String[] args) {
		FilaDinamica fila = new FilaDinamica();

		fila.enqueue(5);
		fila.exibir();
		fila.enqueue(1);
		fila.exibir();
		fila.enqueue(16);
		fila.exibir();
		fila.enqueue(2);
		fila.exibir();
		System.out.println("Removendo " + fila.dequeue());
		fila.exibir();
		System.out.println("Removendo " + fila.dequeue());
		fila.exibir();
	}
}