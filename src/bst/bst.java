package bst;

public class bst {
 
    node root;

    public bst(){
         root = null;
    }
 
    void insert(int key){
         root = insertRec(root, key);
    }
 
    node insertRec(node root, int key)
    {
 
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
 
    void inorder(){
         inorderRec(root);
    }
 
    void inorderRec(node root){
        if (root != null) {
            inorderRec(root.left);
            System.out.println(root.key);
            inorderRec(root.right);
        }
    }
}


