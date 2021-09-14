package bst;

public class bst {
 
<<<<<<< HEAD
    node root;
    
    public void create() {
    	root = null;
    }
    
	public void insert(int key){
         root = insertRec(root, key);
    }
 
    private node insertRec(node root, int key){
        if (root == null){
            root = new node(key);
            return root;
        }
=======
	public class Node
	{
	    int key;
	    Node left, right;
	}
	 
	
	public Node newNode(int item)
	{
	    Node temp = new Node();
	    temp.key = item;
	    temp.left = temp.right = null;
	    return temp;
	}
	 
	public void inorder(Node root)
	{
	    if (root != null)
	    {
	        inorder(root.left);
	        System.out.print(root.key + " ");
	        inorder(root.right);
	    }
	}
	 

	public Node insert(Node node, int key)
	{
	     
>>>>>>> 19503d6df5058c7309d5c63dc111c13038598d4e

	    if (node == null)
	        return newNode(key);
	 

	    if (key < node.key)
	        node.left = insert(node.left, key);
	    else
	        node.right = insert(node.right, key);
	 
	    
	    return node;
	}
	 
	
	public Node delete(Node root, int k)
	{
	     
	   
	    if (root == null)
	        return root;
	 
	    
	    if (root.key > k)
	    {
	        root.left = delete(root.left, k);
	        return root;
	    }
	    else if (root.key < k)
	    {
	        root.right = delete(root.right, k);
	        return root;
	    }
	 
	
	    if (root.left == null)
	    {
	        Node temp = root.right;
	        return temp;
	    }
	    else if (root.right == null)
	    {
	        Node temp = root.left;
	        return temp;
	    }
	    else
	    {
	        Node succParent = root;
	 

	        Node succ = root.right;
	         
	        while (succ.left != null)
	        {
	            succParent = succ;
	            succ = succ.left;
	        }
	 
	 
	        if (succParent != root)
	            succParent.left = succ.right;
	        else
	            succParent.right = succ.right;
	 

	        root.key = succ.key;
	 
	        return root;
	    }
	}
	
    
    public Node search(Node root, int key)
    {
        if (root==null || root.key==key)
            return root;
     
        if (root.key < key)
           return search(root.right, key);
     
        return search(root.left, key);
    }

}


