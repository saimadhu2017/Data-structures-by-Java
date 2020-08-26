package Sorting_Algo;
//This QuickSort is based on pivot element first
import java.util.Scanner;

public class QuickSort2{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        //QuickSort algo
        QuickSortAlgo(arr, 0, n-1);
        //output
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
    public static void QuickSortAlgo(int[] arr,int low,int high){
        if(low<high){
            int pivot=helperQuickSort(arr,low,high);
            QuickSortAlgo(arr,low,pivot-1);
            QuickSortAlgo(arr,pivot+1,high);
        }
    }
    public static int helperQuickSort(int[] arr,int low,int high){
        int pivot=arr[low];
        int j=high+1;
        int i=low;
        while(i<=j){
            i++;
            while(i<high+1 && pivot>arr[i]){
                i++;
            }
            j--;
            while(j>low && pivot<arr[j]){
                j--;
            }
            if(i<j){
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
        int temp=arr[j];
        arr[j]=arr[low];
        arr[low]=temp;
        return(j);
    }
}