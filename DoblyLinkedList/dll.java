package DoblyLinkedList;

public class dll {
    public static void main(String[] args) {
        DoublyLL dll=new DoublyLL();
        dll.append(199);
        dll.push(1);
        dll.push(2);
        System.out.println();
        dll.printddf();//2->1->199
        dll.intsert(1, 100);
        System.out.println();//100->2->1->1999
        dll.printddf();
        dll.append(55);
        System.out.println();//100->2->1->1999->55
        dll.printddf();
        System.out.println();
        dll.delete(4);//100->2->1->1999
        
        dll.printddf();
    }
}

class Node{
    Node prev;
    int data;
    Node next;
    public Node(int data){
        this.prev=null;
        this.data=data;
        this.next=null;
    }
}

class DoublyLL{
    Node head;
    public DoublyLL(){
        this.head=null;
    }
    public void push(int value){
        Node new_node=new Node(value);
        if(this.head==null){
            this.head=new_node;
            return;
        }
        new_node.next=this.head;
        this.head.prev=new_node;
        this.head=new_node;
    }
    public void intsert(int position,int value){
        if(this.head==null || position==1){
            this.push(value);
            return;
        }
        int c=1;
        Node new_node=new Node(value);
        Node temp=this.head;
        while(temp!=null){
            if(c==position){
                break;
            }
            c++;
            temp=temp.next;
        }
        new_node.next=temp;
        new_node.prev=temp.prev;
        temp.prev.next=new_node;
        temp.prev=new_node;
    }
    public void append(int value){
        if(this.head==null){
            this.push(value);
            return;
        }
        Node new_node=new Node(value);
        Node temp=this.head;
        while(temp.next!=null){
            temp=temp.next;
        }
        new_node.prev=temp;
        temp.next=new_node;
    }
    public void printddf(){
        if(this.head==null){
            System.out.println("No elements to print");
            return;
        }
        Node temp=this.head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
    }
    public void printddr(){
        if(this.head==null){
            System.out.println("No elements to print");
            return;
        }
        Node temp=this.head;
        while(temp.next!=null){
            temp=temp.next;
        }
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.prev;
        }
    }
    public void delete(int position){
        if(this.head==null){
            System.out.println("There is no elements in the list to delete");
            return;
        }
        if(position==1 && this.head.next==null){
            this.head=null;
            return;
        }        
        if(position==1){
            this.head=this.head.next;
            return;
        }
        Node temp=this.head;
        int c=1;
        while(temp!=null){
            if(c==position){
                break;
            }
            c++;
            temp=temp.next;
        }
        temp.prev.next=temp.next;
        temp.next.prev=temp.prev;
        temp=null;
    }
}