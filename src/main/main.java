package main;
import bst.bst;

public class main {

	public static void main(String[] args) {
		bst bst = new bst();
		
		bst.node root = null; 
		
		root = bst.insert(root, 50);
		root = bst.insert(root, 30);
		root = bst.insert(root, 40);
		bst.inorder(root);
		
		bst.destroy(root);
		bst.inorder(root);
	}

}
