package bst;

public class bst {
 
    node root;

    public bst(){
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

        if (key < root.key)
            root.left = insertRec(root.left, key);
        else if (key > root.key)
            root.right = insertRec(root.right, key);
        return root;
    }
 
    public void inorder(){
         inorderRec(root);
    }
 
    private void inorderRec(node root){
        if (root != null) {
            inorderRec(root.left);
            System.out.println(root.key);
            inorderRec(root.right);
        }
    }
    
    public node search(node root, int key)
    {
        if (root==null || root.key==key)
            return root;
     
        if (root.key < key)
           return search(root.right, key);
     
        return search(root.left, key);
    }
}
