package Recursiveproblems;
import java.util.*;

class fib{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(f(n));
        sc.close();
    }
    public static int f(int n){
        if(n==1){
            return(0);
        }
        else if(n==2){return(1);}
        else{
            return(f(n-1)+f(n-2));
        }
    }
}