import javax.naming.directory.SearchControls;
import java.util.Scanner;

public class BST {

    public class  Node{

        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = this.right=null;
        }
    }

    Node root;

    BST(){
        root = null;
    }

    public Node insert(Node node,int data){
        if(node ==null) {
            node = new Node(data);
            return node;
        }
        else if(node.data > data)
        {
            node.left = insert(node.left,data);
        }
        else  if(node.data < data)
        {

            node.right = insert(node.right,data);
        }

            return node;

    }

    public Node Search(Node node,int data){

        if(node==null || node.data==data)
            return node;
        else if(node.data>data)
            return  Search(node.left,data);
        else
            return  Search(node.right,data);
    }
    public Node SearchNode(int data){
        return Search(root,data);
    }


    private void inOrder(Node root){

        if(root==null)
            return;
        inOrder(root.left);
        System.out.print(root.data +" ");
        inOrder(root.right);

    }

    public void inOrderTraversal(){
        inOrder(root);
    }
    private void PreOrder(Node root){

        if(root==null)
            return;
        System.out.print(root.data +" ");
        PreOrder(root.left);
        PreOrder(root.right);

    }
    public void PreOrderTraversal(){
        PreOrder(root);
    }

    private void PostOrder(Node root){

        if(root==null)
            return;
        inOrder(root.left);
        inOrder(root.right);
        System.out.print(root.data +" ");

    }
    public void PostOrderTraversal(){
        PostOrder(root);
    }


    public  void insertintoTree(int data)
    {
        root = insert(root,data);
    }










    public static void main(String[] args) {
        BST bst = new BST();
        int n,num;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter no of nodes to add");
        n = scanner.nextInt();
        System.out.println("Enter "+n+" Nodes");
        for (int i=0;i<n;i++)
        {
            num = scanner.nextInt();
            bst.insertintoTree(num);
        }
        System.out.println("Inorder");
        bst.inOrderTraversal();
        System.out.println();
        System.out.println("Postorder");
        bst.PostOrderTraversal();
        System.out.println();
        System.out.println("Preorder");
        bst.PreOrderTraversal();
        System.out.println("\nENTER A NODE TO SEARCH");
        n = scanner.nextInt();
        if(bst.SearchNode(n)!=null)
            System.out.println("Node Found");
        else System.out.println("Node not Present");

    }
}
