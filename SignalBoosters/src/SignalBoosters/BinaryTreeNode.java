package SignalBoosters;

import SignalBoosters.Boosters.Booster;

public class BinaryTreeNode {
    Object element1;
    BinaryTreeNode leftChild, rightChild;
	public String element;

    public BinaryTreeNode() {
    }

    public Object getElement() {
        return element1;
    }

    public BinaryTreeNode(Object element, BinaryTreeNode leftChild, BinaryTreeNode rightChild) {
        this.element1 = element;
        this.leftChild = leftChild;
        this.rightChild = rightChild;
    }

    BinaryTreeNode(Object element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public BinaryTreeNode getLeftChild() {
        return leftChild;
    }

    public BinaryTreeNode getRightChild() {
        return rightChild;
    }

	public Boosters getElement1() {
		// TODO Auto-generated method stub
		return null;
	}
}