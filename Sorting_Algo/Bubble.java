package Sorting_Algo;

import java.util.Scanner;

public class Bubble {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        //Bubble sort alog
        int lastIndex=n-2;
        for(int i=0;i<n-1;i++){
            int swap=0;
            for(int j=0;j<=lastIndex;j++){
                if(arr[j]>arr[j+1]){
                    swap=1;
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
            lastIndex=lastIndex-1;
            if(swap==0){break;}
        }
        //output
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}//O(N^2) is the worst case.