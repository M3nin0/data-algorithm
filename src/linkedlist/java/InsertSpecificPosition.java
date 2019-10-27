package algorithms.linkedlist;

/**
 * Script de exemplo de inser��o de um n� em uma lista ligada, com uma posi��o
 * espec�fica
 *
 */
public class InsertSpecificPosition {
	public static void main(String[] args) {
		GenericLinkedList<String> genericLinkedList = new GenericLinkedList<>();

		// Adicionando dois elementos iniciais
		genericLinkedList.addElement(new Node<>("Bom dia"));
		genericLinkedList.addElement(new Node<>("Boa noite"));

		// Adicionando elemento em uma posi��o espec�fica (1)
		genericLinkedList.addElementInSpecificPosition(0, new Node<>("Boa tarde"));

		// Visualizando resultado
		genericLinkedList.show();
	}
}
