package bst;


public class bst {
	
	public static class node
	{
	    String key;
	    node left, right;
	}
	
	public static node create(String item)
	{
	    node temp = new node();
	    temp.key = item;
	    temp.left = temp.right = null;
	    return temp;
	}
	 
	public static void inorder(WordCounter test, node root)
	{
	    if (root != null)
	    {
	        inorder(test, root.left);
	        System.out.print(root.key + " ");
	        test.words.add(root.key);
	        inorder(test, root.right);
	    }
	}
	 
	public static node insert(node node, String key)
	{
	     
	    if (node == null)
	        return create(key);
	 

	    if (key.compareTo(node.key) < 0)
	        node.left = insert(node.left, key);
	    else
	        node.right = insert(node.right, key);
	 
	    
	    return node;
	}
	 
	public static node delete(node root, String k)
	{
	     
	   
	    if (root == null)
	        return root;
	 
	    
	    if (root.key.compareTo(k) > 0)
	    {
	        root.left = delete(root.left, k);
	        return root;
	    }
	    else if (root.key.compareTo(k) < 0)
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
	
	public static node destroy(node root)
    {
        root = null;
        
        return root;
    }
     
	public static node search(node root, String key)
    {
        if (root==null || root.key==key)
            return root;
     
        if (root.key.compareTo(key) < 0)
           return search(root.right, key);
     
        return search(root.left, key);
    }

}

