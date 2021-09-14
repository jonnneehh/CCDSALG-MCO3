package bst;


public class bst {
	
	static class node
	{
	    int key;
	    node left, right;
	}
	
	static node create(int item)
	{
	    node temp = new node();
	    temp.key = item;
	    temp.left = temp.right = null;
	    return temp;
	}
	 
	static void inorder(node root)
	{
	    if (root != null)
	    {
	        inorder(root.left);
	        System.out.print(root.key + " ");
	        inorder(root.right);
	    }
	}
	 

	static node insert(node node, int key)
	{
	     

	    if (node == null)
	        return create(key);
	 

	    if (key < node.key)
	        node.left = insert(node.left, key);
	    else
	        node.right = insert(node.right, key);
	 
	    
	    return node;
	}
	 
	
	static node delete(node root, int k)
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
	        node temp = root.right;
	        return temp;
	    }
	    else if (root.right == null)
	    {
	        node temp = root.left;
	        return temp;
	    }
	    else
	    {
	        node succParent = root;
	 

	        node succ = root.right;
	         
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
	
    
	static node search(node root, int key)
    {
        if (root==null || root.key==key)
            return root;
     
        if (root.key < key)
           return search(root.right, key);
     
        return search(root.left, key);
    }

}


