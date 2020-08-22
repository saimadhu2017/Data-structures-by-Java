package Recursiveproblems;
import java.util.*;

class fac{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        System.out.println(f(n));
        sc.close();
    }
    public static long f(long n){
        if(n==1 || n==0){
            return(1);
        }
        return(n*f(n-1));
    }
}