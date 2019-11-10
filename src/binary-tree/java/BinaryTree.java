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
}
