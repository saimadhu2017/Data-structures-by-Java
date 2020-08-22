package Recursiveproblems;
import java.util.*;
class combination{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r=sc.nextInt();
        System.out.println(f(n)/((f(r))*(f(n-r))));
        sc.close();
    }
    static int f(int n){
        if(n==0 || n==1){
            return(1);
        }
        else{
            return(n*f(n-1));
        }
    }
}