import java.util.*;

public class CircularQueue {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        CircularQ cQ = new CircularQ(size + 1);
        cQ.enqeue(1);
        cQ.enqeue(2);
        cQ.deqeue();
        cQ.deqeue();
        cQ.deqeue();
        cQ.printQ();
        sc.close();
    }
}
class CircularQ{
    int size;
    int head;
    int tail;
    int[] arr;
    public CircularQ(int size){
        this.size=size;
        this.head=0;
        this.tail=0;
        this.arr=new int[this.size];
    }
    public void enqeue(int value){
        if((this.tail+1)%this.size==this.head){
            System.out.println("Circular Queue is Full you cannot add.");
            return;
        }
        this.arr[this.tail]=value;
        this.tail=(this.tail+1)%this.size;
    }
    public void deqeue(){
        if(this.head==this.tail){
            System.out.println("No elements to delete.");
            return;
        }
        this.head=(this.head+1)%this.size;
    }
    public void printQ(){
        if(this.head==this.tail){
            System.out.println("Queue is empty..");
            return;
        }
        int i=this.head;
        while(i!=this.tail){
            System.out.print(this.arr[i]+" ");
            i=(i+1)%this.size;
        }
    }
}