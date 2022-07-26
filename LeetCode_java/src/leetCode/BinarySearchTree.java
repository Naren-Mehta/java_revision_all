package leetCode;

class Node {
    int val;
    Node left;
    Node right;

    Node(int val){
        this.val = val;
    }
}
public class BinarySearchTree {
    Node root = null;

    public void insert(int val){
        Node node = new Node(val);

        if(root == null){
            root = node;
        }else{
            Node current = root;

            if(current.val > val){

            }
        }
    }

    public static void main(String[] args) {

        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(10);



    }
}
