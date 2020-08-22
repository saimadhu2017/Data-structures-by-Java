package circularLinkedList;

public class CircularLL{
    public static void main(String[] args) {
        LinkedL l=new LinkedL();
        l.push(1);
        l.push(2);
        l.push(3);
        l.append(100);
        l.printList();
        l.inserAt(4,89);
        System.out.println();
        l.printList();
        l.delete(2);
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
        Node temp=this.head;
        new_node.next=this.head;
        if(this.head!=null){
             while(temp.next!=this.head){
                 temp=temp.next;
             }
             temp.next=new_node;
        }else{
            new_node.next=new_node;
        }
        this.head=new_node;
    }
    public void inserAt(int position,int value){
        if(position==1){this.push(value);return;}
        Node new_node=new Node(value);
        Node temp=this.head;
        int c=1;
        Node prev_node=this.head;
        while(temp.next!=this.head){
            if(c==position){
                break;
            }
            c++;
            prev_node=temp;
            temp=temp.next;
        }
        new_node.next=temp;
        prev_node.next=new_node;
    }
    public void append(int value){
        Node new_node=new Node(value);
        if(this.head==null){
            this.head=new_node;
            new_node.next=new_node;
            return;
        }
        Node last=this.head;
        while(last.next!=this.head){
            last=last.next;
        }
        last.next=new_node;
        new_node.next=this.head;
    }
    public void printList(){
        Node tmp=this.head;
        System.out.print(tmp.data+"-->");
        tmp=tmp.next;
        while(tmp!=this.head){
            System.out.print(tmp.data+"-->");
            tmp=tmp.next;
        }
    }
    public void pop(){
        Node temp=this.head.next;
        Node prev_node=this.head;
        while(temp!=this.head){
            prev_node=temp;
            temp=temp.next;
        }
        prev_node.next=temp.next;
        this.head=temp.next;
        temp=null;
    }
    public void delete(int position){
        if(this.head==null){
            System.out.println("There are no elements to delete..");
            return;
        }
        if(this.head==this.head.next){
            this.head=null;
            return;
        }
        if(position==1){
            this.pop();
            return;
        }
        Node temp=this.head;
        Node prev_node=this.head;
        int c=1;
        while(temp.next!=this.head){
            if(c==position){
                break;
            }
            c++;
            prev_node=temp;
            temp=temp.next;
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