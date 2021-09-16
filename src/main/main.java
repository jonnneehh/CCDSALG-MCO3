package main;
import bst.bst;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bst.node root = null; 
		
		root = bst.insert(root, "it");
		root = bst.insert(root, "works");
		root = bst.insert(root, "too");
		root = bst.insert(root, "since");
		root = bst.insert(root, "input");
		root = bst.insert(root, "is");
		root = bst.insert(root, "only");
		root = bst.insert(root, "lowercase");
		bst.inorder(root);
		System.out.print("\n");
		root = bst.destroy(root);
		System.out.print("\n");
		bst.inorder(root);
	}
}