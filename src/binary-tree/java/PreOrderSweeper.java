package algorithms.tree;

import java.util.Objects;

/**
 * Representa��o da varredura Pr�-Ordem (raiz-esquerda-direita)
 * @author felipe
 *
 */
public class PreOrderSweeper implements Sweeper {
	@Override
	public void sweep(TreeNode<?> treeNode) {
		System.out.println(treeNode.getData());

		if (!Objects.isNull(treeNode.getLeftLeaf()))
			sweep(treeNode.getLeftLeaf());
		if (!Objects.isNull(treeNode.getRightLeaf()))
			sweep(treeNode.getRightLeaf());
	}
}
