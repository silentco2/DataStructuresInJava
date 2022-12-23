public class BinarySearchTree {
    private class Node{
        int data;
        Node left,right;
        Node(int value){data = value;}
    }
    private Node root;
    public void insert(int value){
        root = insert(value,root);
    }
    private Node insert(int value,Node node){
        if (node == null) node = new Node(value);
        else if (node.data>value) node.left = insert(value,node.left);
        else node.right = insert(value,node.right);
        return node;
    }
    public void remove(int value){
        root = remove(value,root);
    }
    private Node remove(int value,Node node){
        if (node == null) return null;
        else if (node.data>value) node.left = remove(value,node.left);
        else if (node.data<value) node.right = remove(value,node.right);
        else{
            if (node.left == null) return node.right;
            else if (node.right == null) return node.left;
            node.data = minValue(node.right);
            node.right = remove(node.data,node.right);
        }
        return node;
    }
    private int minValue(Node node){
        int min = node.data;
        while (node != null){
            min = node.data;
            node = node.left;
        }
        return min;
    }

    public void preorder(){
        preorder(root);
    }
    private void preorder(Node node){
        if(node != null){
            System.out.println(node.data);
            preorder(node.left);
            preorder(node.right);
        }
    }
    public void inorder(){
        inorder(root);
    }
    private void inorder(Node node){
        if(node != null){
            inorder(node.left);
            System.out.println(node.data);
            inorder(node.right);
        }
    }
    public void postorder(){
        postorder(root);
    }
    private void postorder(Node node){
        if(node != null){
            postorder(node.left);
            postorder(node.right);
            System.out.println(node.data);
        }
    }
}
