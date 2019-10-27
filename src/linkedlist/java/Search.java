package algorithms.linkedlist;

public class Search {
	public static void main(String[] args) {

		// Criando lista ligada
		GenericLinkedList<String> genericLinkedList = new GenericLinkedList<>(new Node<>("Felipe"));

		// Adicionando n�s a lista ligada
		genericLinkedList.addElement(new Node<>("Jo�o"));
		genericLinkedList.addElement(new Node<>("Maria"));
		genericLinkedList.addElement(new Node<>("Ana"));

		// Buscando Maria
		System.out.println(genericLinkedList.search("Ana"));
		System.out.println(genericLinkedList.search("Pedro")); // Elemento n�o presente
	}
}
