package CircularQueues;

public class CircularQ{
    public static void main(String[] args) {
        int size=1;
        CircularQueue cQ=new CircularQueue(size+1);
        // cQ.enqeue(1);
        // cQ.enqeue(2);
        // cQ.enqeue(3);
        // cQ.enqeue(4);
        // cQ.enqeue(5);
        // cQ.printQ();
        // cQ.deqeue();
        // cQ.deqeue();
        // cQ.deqeue();
        // cQ.deqeue();
        // cQ.deqeue();
        // cQ.deqeue();
        // System.out.println();
        // cQ.printQ(); the above is for 5 size
        cQ.enqeue(1);
        
        cQ.printQ();
        cQ.deqeue();
        System.out.println();
        
        cQ.deqeue();
        cQ.deqeue();
    }
}

class CircularQueue{
    int size;
    int head;
    int tail;
    int[] arr;
    public CircularQueue(int size){
        this.size=size;
        this.head=-1;
        this.tail=-1;
        this.arr=new int[this.size];
    }
    public void enqeue(int value){
        if((this.tail+1)%this.size==this.head){
            System.out.println("The Queue is full..");
            return;
        }
        if(this.head==-1 && this.tail==-1){
            this.head=0;
            this.tail=0;
            this.arr[this.tail]=value;
        }
        else{
            this.arr[this.tail]=value;
        }
        this.tail=(this.tail+1)%this.size;
    }
    public void deqeue(){
        if(this.head==-1 && this.tail==-1){
            System.out.println("Queue is already empty and no deletion takesplace");
            return;
        }
        else if(this.head==this.tail){
            this.arr[this.head]=0;
            this.head=this.tail=-1;
            return;
        }else{
            this.arr[this.head]=0;
            this.head=(this.head+1)%this.size;
            return;
        }
    }
    public void printQ(){
        if(this.head==-1){
            System.out.println("soory no elements to print..");
            return;
        }
        int i=this.head;
        while(i!=this.tail){
            System.out.print(this.arr[i]+" ");
            i=(i+1)%this.size;
        }
    }
}