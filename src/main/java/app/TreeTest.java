package app;

import datastructures.BinaryTree;
import datastructures.BinaryTreeNode;
import problems.trees.TreeProblems;
import utils.TreeUtils;

public class TreeTest
{

    public static void main(String[] args)
    {
	BinaryTree bt = TreeUtils.getSampleBinaryTree();
	
	int node1 = 30, node2 = 90;
	BinaryTreeNode lca = TreeProblems.findLCAinBST(bt.root, node1, node2);
	
	System.out.println("LCA of " + node1 + " and " + node2 + " is " 
		+ lca.data);
    }

}
