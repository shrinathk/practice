package utils;

import datastructures.BinaryTree;
import datastructures.BinaryTreeNode;

public class TreeUtils
{
    public static BinaryTree getSampleBinaryTree()
    {
	BinaryTree bt = new BinaryTree();
	
	/*
	 * Constructing the following tree 
	 * 	 60 
	 * 	/ \ 
	 *     40 80 
	 *    / \ / \ 
	 *   30 50 70 90
	 */
	bt = new BinaryTree(60); // setting root node

	bt.root.left = new BinaryTreeNode(40);
	bt.root.right = new BinaryTreeNode(80);

	bt.root.left.left = new BinaryTreeNode(30);
	bt.root.left.right = new BinaryTreeNode(50);

	bt.root.right.left = new BinaryTreeNode(70);
	bt.root.right.right = new BinaryTreeNode(90);
	
	return bt;
    }
}
