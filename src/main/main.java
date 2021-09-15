package main;
import bst.bst;

public class main {

	public static void main(String[] args) {
		bst bst = new bst();
		
		bst.node root = null; 
		
		root = bst.insert(root, 10);
		root = bst.insert(root, 20);
		root = bst.insert(root, 1000000);
		bst.inorder(root);
		System.out.print("\n");
		bst.destroy(root);
		bst.inorder(root);
	}
}
