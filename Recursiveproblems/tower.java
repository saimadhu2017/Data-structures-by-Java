package Recursiveproblems;
import java.util.*;

class tower{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String A="A",B="B",C="C";//source=A,target=C
        f(n,A,C,B);
        sc.close();
    }
    static void f(int n,String source,String target,String auxilary){
        if(n>0){
            f(n-1,source,auxilary,target);
            //here moving all the disks which are above the bottom most disk from source to auxilary using the target
            System.out.println("Move number "+n+" Disk from "+source+" to "+target);
            //bootom most disk is remaing in source now we move that to target 
            f(n-1,auxilary,target,source);
            //Again moving all the remaing disks in auxilary to target using the source
        }
    }
}