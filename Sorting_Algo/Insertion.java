package Sorting_Algo;

import java.util.Scanner;

public class Insertion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            if(i!=0){
                for(int j=i;j>0;j--){
                    if(arr[j]<arr[j-1]){
                        int temp=arr[j];
                        arr[j]=arr[j-1];
                        arr[j-1]=temp;
                    }else{
                        break;
                    }
                }
            }
        }
        //Insertion alog
        // for(int i=0;i<n;i++){
        //     if(i!=0){
        //         for(int j=i;j>0;j--){
        //             if(arr[j]<arr[j-1]){
        //                 int temp=arr[j];
        //                 arr[j]=arr[j-1];
        //                 arr[j-1]=temp;
        //             }else{
        //                 break;
        //             }
        //         }
        //     }
        // }
        //output
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}//O(N^2)