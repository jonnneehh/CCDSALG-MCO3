package main;
import bst.bst;

public class Main {

	public static void Main(String[] args) {
		
		bst.node root = null; 
		
		root = bst.insert(root, 35);
		root = bst.insert(root, 30);
		root = bst.insert(root, 40);
		bst.inorder(root);
		System.out.print("\n");
		root = bst.destroy(root);
		System.out.print("\n");
		bst.inorder(root);
	}
}
