package Sorting_Algo;

import java.util.Scanner;

class CountingSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        int max=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            if(i==0){
                max=arr[i];
            }
            else{
                if(max<arr[i]){max=arr[i];}
            }
        }
        //selection Counting sort
        CountSort(arr,max);
        //output
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
    public static void CountSort(int[] arr,int max){
        int[] brr=new int[max+1];
        int[] nbrr=new int[max+1];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=0){
                brr[arr[i]]++;
            }else{
                int p=Math.abs(arr[i]);
                nbrr[p]++;
            }
        }
        int j=0;
        for(int i=nbrr.length-1;i>=0;i--){
            if(nbrr[i]!=0){
                arr[j]=i*(-1);
                nbrr[i]--;
                i++;
                j++;
            }
        }
        for(int i=0;i<brr.length;i++){
            if(brr[i]!=0){
                arr[j]=i;
                brr[i]--;
                i--;
                j++;
            }
        }
    }
}