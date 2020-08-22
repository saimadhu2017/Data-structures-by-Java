package BST;

public class BinaryST {
    public static void main(String[] args) {
        BinarySearchTree bst=new BinarySearchTree();
        System.out.println(bst.get_root());//initally no values
        bst.insert(10);
        bst.insert(11);
        bst.insert(9);
        bst.insert(20);
        // bst.delete(100);
        // bst.search(100);
        // bst.search(1);
        bst.printinorder();
        System.out.println();
        bst.printpostorder();
        System.out.println();
        bst.printpreorder();
    }
}

class Node{
    Node right;
    Integer data;
    Node left;
    public Node(Integer data){
        this.right=null;
        this.data=data;
        this.left=null;
    }
}

class BinarySearchTree{
    Node root;
    public BinarySearchTree(){
        this.root=null;
    }
    public Node get_root(){
        return(this.root);
    }

    public void insert(int value){
        if(this.get_root()==null){
            this.root=new Node(value);
        }
        else{
            this.insert_helper(this.get_root(), value);
        }
    }
    public void insert_helper(Node this_node,int value){
        if(this_node.data>value){
            if(this_node.left==null){
                this_node.left=new Node(value);
            }else{
                this.insert_helper(this_node.left, value);
            }
        }
        else{
            if(this_node.right==null){
                this_node.right=new Node(value);
            }
            else{
                this.insert_helper(this_node.right, value);
            }
        }
    }

    public Node get_inorder_successor(Node this_node){//geting the least value in the right side
        Node myLeastNode=this_node;
        while(myLeastNode.left!=null){
            myLeastNode=myLeastNode.left;
        }
        return(myLeastNode);
    }
    public Node get_inorder_predesor(Node this_node){//getting the highest value in left side
        Node myGreatestNode=this_node;
        while(myGreatestNode.right!=null){
            myGreatestNode=myGreatestNode.right;
        }
        return(myGreatestNode);
    }

    public void delete(int value){
        this.deleteNode(this.get_root(), value);
    }
    public Node deleteNode(Node this_Node,int value){//very complex but it is easy becuse of little bit of triky
        if(this_Node==null){
            System.out.println("No elements to be deleted...");
            return(this_Node);
        }
        if(value < this_Node.data){
            this_Node.left=this.deleteNode(this_Node.left, value);
        }
        else if(value > this_Node.data){
            this_Node.right=this.deleteNode(this_Node.right, value);
        }
        else{
            //case with one or zero childs
            if(this_Node.left == null){
                Node temp=this_Node.right;
                this_Node=null;
                return(temp);
            }
            else if(this_Node.right == null){
                Node temp=this_Node.left;
                this_Node=null;
                return(temp);
            }
            //case with two childerns.
            Node temp=this.get_inorder_successor(this_Node.right);
            this_Node.data=temp.data;
            this_Node.right=this.deleteNode(this_Node.right, temp.data);   
        }
        return(this_Node);
    }

    public void search(int value){
        this.search_node(this.get_root(), value);
    }
    public void search_node(Node thisNode,int value){
        if(thisNode == null){
            System.out.println("Key is not found");
            return;
        }
        else if(thisNode.data==value){
            System.out.println("Key is found");
            return;
        }
        else{
            if(value<thisNode.data){
                this.search_node(thisNode.left, value);
            }
            else{
                this.search_node(thisNode.right, value);
            }
        }
    }
    
    public void inorder(Node thisNode){
        if(thisNode!=null){
            this.inorder(thisNode.left);
            System.out.print(thisNode.data+", ");
            this.inorder(thisNode.right);
        }
    }
    public void preorder(Node thisNode){
        if(thisNode!=null){
            System.out.print(thisNode.data+", ");
            this.preorder(thisNode.left);
            this.preorder(thisNode.right);
        }
    }
    public void postorder(Node thisNode){
        if(thisNode!=null){
            this.postorder(thisNode.left);
            this.postorder(thisNode.right);
            System.out.print(thisNode.data+", ");
        }
    }
    public void printinorder(){
        this.inorder(this.get_root());
    }
    public void printpreorder(){
        this.preorder(this.get_root());
    }
    public void printpostorder(){
        this.postorder(this.get_root());
    }
}

