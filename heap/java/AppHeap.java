public class AppHeap {
	public static void main(String[] args) {
		HeapMin heap = new HeapMin(10);

		heap.inserir(1);
		heap.exibir();
		heap.inserir(3);
		heap.exibir();
		heap.inserir(6);
		heap.exibir();
		heap.inserir(5);
		heap.exibir();
		heap.inserir(9);
		heap.exibir();
		heap.inserir(8);
		heap.exibir();
		heap.inserir(-2);
		heap.exibir();

		System.out.println("Menor: " + heap.menor());
		System.out.println("Removendo...");
		heap.remover();
		heap.exibir();

		System.out.println("Menor: " + heap.menor());
		System.out.println("Removendo...");
		heap.remover();
		heap.exibir();
	}
}