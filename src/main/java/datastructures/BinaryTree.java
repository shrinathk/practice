package datastructures;

public class BinaryTree
{
    public BinaryTreeNode root;

    public BinaryTree()
    {
	this.root = null;
    }

    public BinaryTree(int data)
    {
	this.root = new BinaryTreeNode(data);
    }

    public static void printInOrder(BinaryTreeNode n)
    {
	if (n == null) 
	    return;

	printInOrder(n.left);
	System.out.print(n.data + " ");
	printInOrder(n.right);
    }
    
    public static void printPreOrder(BinaryTreeNode n)
    {
	if (n == null) 
	    return;

	System.out.print(n.data + " ");
	printPreOrder(n.left);
	printPreOrder(n.right);
    }
    
    public static void printPostOrder(BinaryTreeNode n)
    {
	if (n == null) 
	    return;

	printPostOrder(n.left);
	printPostOrder(n.right);
	System.out.print(n.data + " ");
    }
    
    public static void printLevelOrder(BinaryTreeNode n)
    {
	int treeHeight = getTreeHeight(n);
	
	for(int i = 1; i <= treeHeight; i++)
	    printLevelOrder(n, i);
    }
    
    private static void printLevelOrder(BinaryTreeNode n, int level)
    {
	if(n == null) 
	    return;
	
	if(level == 1)
	{
	    System.out.print(n.data + " ");
	}	    
	else
	{
	    printLevelOrder(n.left, level - 1);
	    printLevelOrder(n.right, level - 1);
	}
    }
    
    private static int getTreeHeight(BinaryTreeNode n)
    {
	if (n == null) 
	    return 0;

	int lHeight = getTreeHeight(n.left);
	int rHeight = getTreeHeight(n.right);

	if (lHeight > rHeight)
	    return (lHeight + 1);
	else
	    return (rHeight + 1);
    }
    
    public static boolean isBinaryTreeHeightBalanced(BinaryTreeNode n)
    {
	if(n == null || (n.left == null && n.right == null))
	    return true;
	
	int lHeight = getTreeHeight(n.left);
	int rHeight = getTreeHeight(n.right);
	
	return (Math.abs(lHeight - rHeight) <= 1) 
		&& isBinaryTreeHeightBalanced(n.left) 
		&& isBinaryTreeHeightBalanced(n.right);
    }
    
    public static boolean isBinaryTreeBST(BinaryTreeNode n)
    {
	if(n == null || (n.left == null && n.right == null))
	    return true;
	else
	    return isBinaryTreeBST(n, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
    
    private static boolean isBinaryTreeBST(BinaryTreeNode n, int min, int max)
    {
	if(n == null)
	    return true;
	
	if(n.data < min || n.data > max)
	    return false;
	else
	    return isBinaryTreeBST(n.left, min, n.data - 1) 
		    && isBinaryTreeBST(n.right, n.data + 1, max);
    }
    
    public static BinaryTreeNode addNode(BinaryTreeNode n, int data)
    {
	if(n == null)
	    return new BinaryTreeNode(data);
	
	if(n.data == data)
	    return null;
	
	if (data < n.data)
	    n.left = addNode(n.left, data);
	else
	    n.right = addNode(n.right, data);	
	
	return n;
    }
    
    public static boolean searchNode(BinaryTreeNode n, int data)
    {
	if(n == null)
	    return false;
	
	if(n.data == data)
	    return true;
	
	if(data < n.data)
	    return searchNode(n.left, data);
	else
	    return searchNode(n.right, data);
    }
}
