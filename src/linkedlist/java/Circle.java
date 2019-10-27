package algorithms.linkedlist;

/**
 * Exemplo de uma lista encadeada Circular
 *
 */
public class Circle {
	public static void main(String[] args) {
		// Criando os n�s e gerando o v�nculo circular
		Node<String> nodeOne = new Node<>("Bom dia");
		Node<String> nodeTwo = new Node<>("Boa tarde");
		Node<String> nodeThree = new Node<>("Boa noite");

		nodeOne.setNext(nodeTwo);
		nodeTwo.setNext(nodeThree);
		nodeThree.setNext(nodeOne);

		// Gerando a lista ligada circular
		GenericLinkedList<String> genericLinkedList = new GenericLinkedList<>(nodeOne);

		// Visualizando a lista (Pode ser que a execu��o n�o chegue ao fim)
		genericLinkedList.show();
	}
}
