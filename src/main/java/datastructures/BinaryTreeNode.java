package datastructures;

public class BinaryTreeNode
{
    public int data;
    public BinaryTreeNode left;
    public BinaryTreeNode right;

    public BinaryTreeNode(int data)
    {
	this.data = data;
	this.right = null;
	this.left = null;
    }
}
