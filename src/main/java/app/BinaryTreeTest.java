package app;

import datastructures.BinaryTree;
import datastructures.BinaryTreeNode;
import utils.TreeUtils;

public class BinaryTreeTest
{
    public static void main(String[] args)
    {
	BinaryTree bt = TreeUtils.getSampleBinaryTree();
	
	// Testing Tree Traversals
	
	// 30, 40, 50, 60, 70, 80, 90
	System.out.print("Binary Tree In Order Traversal    - ");
	BinaryTree.printInOrder(bt.root);
	System.out.println();
		
	// 60, 40, 30, 50, 80, 70, 90
	System.out.print("Binary Tree Pre Order Traversal   - ");
	BinaryTree.printPreOrder(bt.root);
	System.out.println();
		
	// 30, 50, 40, 70, 90, 80, 60
	System.out.print("Binary Tree Post Order Traversal  - ");
	BinaryTree.printPostOrder(bt.root);
	System.out.println();
	
	// 60, 40, 80, 30, 50, 70, 90
	System.out.print("Binary Tree Level Order Traversal - ");
	BinaryTree.printLevelOrder(bt.root);
	System.out.println();
	
	// Is Binary Tree BST ?
	System.out.println("Is Binary Tree BST ? - " + BinaryTree.isBinaryTreeBST(bt.root));
	System.out.println("Adding an incorrectly placed node");
	bt.root.right.right.right = new BinaryTreeNode(1);
	System.out.println("Is Binary Tree BST ? - " + BinaryTree.isBinaryTreeBST(bt.root));
	
	// Is Binary Tree Height Balanced ?
	System.out.println("Is Binary Tree Height Balanced ? - " + BinaryTree.isBinaryTreeHeightBalanced(bt.root));
	System.out.println("Adding a few children only to the right");
	bt.root.right.right.right.right = new BinaryTreeNode(2);
	bt.root.right.right.right.right.right = new BinaryTreeNode(3);
	System.out.println("Is Binary Tree Height Balanced ? - " + BinaryTree.isBinaryTreeHeightBalanced(bt.root));
	
	// Adding a new node
	int newNode = 55;
	BinaryTree.addNode(bt.root, newNode);
	System.out.print("Added a new node " + newNode);
	System.out.println();
	System.out.print("Binary Tree Level Order Traversal - ");
	BinaryTree.printLevelOrder(bt.root);
	System.out.println();
	
	// Searching  a node
	int aSearch1 = 80;
	int aSearch2 = 120;
	
	System.out.println("Does " + aSearch1 + " exist in the tree ? - " 
		+ BinaryTree.searchNode(bt.root, aSearch1));
	System.out.println("Does " + aSearch2 + " exist in the tree ? - " 
		+ BinaryTree.searchNode(bt.root, aSearch2));
    }
}
