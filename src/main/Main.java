package main;
import bst.bst;

public class Main {

	public static void main(String[] args) {
		
		bst.node root = null; 
		
<<<<<<< HEAD:src/main/main.java
		root = bst.insert(root, 10);
		root = bst.insert(root, 20);
		root = bst.insert(root, 1000000);
		bst.inorder(root);
		System.out.print("\n");
		bst.destroy(root);
=======
		root = bst.insert(root, 35);
		root = bst.insert(root, 30);
		root = bst.insert(root, 40);
		bst.inorder(root);
		System.out.print("\n");
		root = bst.destroy(root);
		System.out.print("\n");
>>>>>>> e8b5d756dae952d9b2d06663dbf1838ebfc596f2:src/main/Main.java
		bst.inorder(root);
	}
}
