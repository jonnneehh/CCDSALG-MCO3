package bst;


public class bst {
	
	public static class node
	{
	    int key;
	    node left, right;
	}
	
	public static node create(int item)
	{
	    node temp = new node();
	    temp.key = item;
	    temp.left = temp.right = null;
	    return temp;
	}
	 
	public static void inorder(node root)
	{
	    if (root != null)
	    {
	        inorder(root.left);
	        System.out.print(root.key + " ");
	        inorder(root.right);
	    }
	}
	 
	public static node insert(node node, int key)
	{
	     
	    if (node == null)
	        return create(key);
	 

	    if (key < node.key)
	        node.left = insert(node.left, key);
	    else
	        node.right = insert(node.right, key);
	 
	    
	    return node;
	}
	
	 
	public static node delete(node root, int k)
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
<<<<<<< HEAD
	}
	
	
	public void inorderDelete(node root)
	{
	    int i = 0;
	    
		if (root != null)
	    {
			inorderDelete(root.left);
	        values.add(i, root.key);
	        i++;
	        inorderDelete(root.right);
	    }
	}
	
	public void destroy(node root) {

		inorderDelete(root);
		
		for(int i = 0; i < values.size(); i++)
			delete(root, values.get(i));
		
		this.root = null;
=======
	    
>>>>>>> e8b5d756dae952d9b2d06663dbf1838ebfc596f2
	}
	
	public static node destroy(node root)
    {
        root = null;
        
        return root;
    }
     
	public static node search(node root, int key)
    {
        if (root==null || root.key==key)
            return root;
     
        if (root.key < key)
           return search(root.right, key);
     
        return search(root.left, key);
    }
}


