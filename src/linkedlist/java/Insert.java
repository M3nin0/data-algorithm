package algorithms.linkedlist;

/**
 * Script de exemplo de inser��o de um n� em uma lista ligada
 *
 */
public class Insert {
	public static void main(String[] args) {
		GenericLinkedList<Integer> genericLinkedList = new GenericLinkedList<>();

		// Adicionando tr�s elementos iniciais
		genericLinkedList.addElement(new Node<>(123));
		genericLinkedList.addElement(new Node<>(321));
		genericLinkedList.addElement(new Node<>(655));

		genericLinkedList.show();
	}
}
