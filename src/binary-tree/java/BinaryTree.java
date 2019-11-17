package algorithms.tree;

import java.util.Objects;

/**
 * Classe da �rvore bin�ria
 * 
 * @author felipe
 *
 * @param <T>
 */
public class BinaryTree<T extends Number & Comparable<T>> {
	private final TreeNode<T> root; // immutable

	BinaryTree(TreeNode<T> root) {
		this.root = root;
	}

	public TreeNode<T> getRoot() {
		return root;
	}

	/**
	 * Fun��o para inserir n�s na �rvore bin�ria
	 * 
	 * @param newNode
	 */
	public void insertNode(TreeNode<T> newNode) {
		this.insertNodeEngine(this.root, newNode);
	}

	/**
	 * Engine que realiza a inser��o recursiva dos elementos na �rvore bin�ria.
	 * Mantendo toda sua estrutura ordenada
	 * 
	 * @param root
	 * @param newNode
	 * @return
	 */
	private TreeNode<T> insertNodeEngine(TreeNode<T> root, TreeNode<T> newNode) {
		if (Objects.isNull(root))
			return newNode;

		if (root.getData().compareTo(newNode.getData()) == 1) // >= 1 indica que root > newNode
			root.setLeftLeaf(insertNodeEngine(root.getLeftLeaf(), newNode));
		else
			root.setRightLeaf(insertNodeEngine(root.getRightLeaf(), newNode));

		return root;
	}

	public void showTree(Sweeper sweeper) {
		sweeper.sweep(root);
	}

	/**
	 * Realiza a busca de um elemento na �rvore bin�ria
	 * 
	 * @param element
	 * @return
	 */
	public TreeNode<T> search(T element) {
		return searchEngine(element, root);
	}

	/**
	 * Engine de busca bin�ria na �rvore. Perceba que, por estar ordenado a busca �
	 * f�cilmente constru�da seguindo a ideia bin�ria, onde o espa�o vai sendo
	 * dividido para que na busca n�o seja considerado valores que n�o fazem sentido
	 * ser comparados
	 * 
	 * @param element
	 * @param root
	 * @return
	 */
	private TreeNode<T> searchEngine(T element, TreeNode<T> root) {
		if (Objects.isNull(root))
			return null;

		// Raiz
		if (root.getData().equals(element))
			return root;

		// Esquerda-Direita
		if (root.getData().compareTo(element) == 1)
			return searchEngine(element, root.getLeftLeaf());
		return searchEngine(element, root.getRightLeaf());

	}

}
