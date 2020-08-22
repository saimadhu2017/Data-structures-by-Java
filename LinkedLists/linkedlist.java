package LinkedLists;
public class linkedlist{
    public static void main(String[] args) {
        LinkedL l=new LinkedL();
        l.push(1);
        l.push(2);
        l.push(3);
        l.append(100);
        l.printList();
        System.out.println();
        l.inserAt(5,89);
        l.printList();
        System.out.println();
        l.delete(5);
        l.printList();
        l.delete(1);
        System.out.println();
        l.printList();
        l.inserAt(1,22);
        System.out.println();
        l.printList();
        System.out.println();
        System.out.println("count :"+l.getCount());
        l.reverse();
        l.printList();
        l.delete(1);
        System.out.println();
        l.printList();
        l.reverse();
        System.out.println();
        l.printList();
    }
}

class Node{
    int data;
    Node next;
    public Node(int data){
        this.data=data;
        this.next=null;
    }
}

class LinkedL{
    Node head;
    public LinkedL(){
        this.head=null;
    }
    public void push(int value){
        Node new_node=new Node(value);
        new_node.next=this.head;
        this.head=new_node;
    }
    public void inserAt(int position,int value){
        position=position-1;
        if(position==0){this.push(value);return;}
        Node new_node=new Node(value);
        Node temp=this.head;
        int c=1;
        while(temp!=null){
            if(c==position){
                break;
            }
            c++;
            temp=temp.next;
        }
        new_node.next=temp.next;
        temp.next=new_node;
    }
    public void append(int value){
        Node new_node=new Node(value);
        if(this.head==null){
            this.head=new_node;
            return;
        }
        Node last=this.head;
        while(last.next!=null){
            last=last.next;
        }
        last.next=new_node;
    }
    public void printList(){
        Node tmp=this.head;
        while(tmp!=null){
            System.out.print(tmp.data+"-->");
            tmp=tmp.next;
        }
    }
    public void delete(int position){
        Node temp=this.head;
        Node prev_node=this.head;
        int c=1;
        if(position==1){
            this.head=this.head.next;
            temp=null;
            return;
        }
        while(c!=position && temp!=null){
            prev_node=temp;
            temp=temp.next;
            c++;
        }
        prev_node.next=temp.next;
        temp=null;
    }
    public int getCountNode(Node node){
        if(node==null){
            return(0);
        }
        else{
            return(1+this.getCountNode(node.next));
        }
    }
    public int getCount(){
        return(this.getCountNode(this.head));
    }

    public void reverse(){
        Node prev_node=null;
        Node next_node=null;
        Node current_node=this.head;
        reverseList(prev_node,next_node,current_node);
    }
    public void reverseList(Node prev_node,Node next_node,Node current_node){
        if(current_node!=null){
           next_node=current_node.next;
           current_node.next=prev_node;
           prev_node=current_node;
           current_node=next_node;
           if(current_node==null){
               this.head=prev_node;
               return;
           }
           reverseList(prev_node,next_node,current_node);
        }
        return;
    }
}