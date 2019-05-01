package problems.trees;

import datastructures.BinaryTreeNode;

public class TreeProblems
{
    public static BinaryTreeNode findLCAinBST(BinaryTreeNode n, int n1, int n2)
    {
	if (n == null)
	    return null;

	if (n.data < n1 && n.data < n2)
	    return findLCAinBST(n.right, n1, n2);

	if (n.data > n1 && n.data > n2)
	    return findLCAinBST(n.left, n1, n2);

	return n; // n is in between and hence the LCA.

    }
}
