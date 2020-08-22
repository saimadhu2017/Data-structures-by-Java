package Recursiveproblems;
import java.util.*;

class pow{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int b=sc.nextInt();
        int p=sc.nextInt();
        System.out.println(power(b,p));
        sc.close();
    }
    static int power(int b,int p){
        if(p==0){
            return(1);
        }
        else{
            return(b*power(b,p-1));
        }
    }
}