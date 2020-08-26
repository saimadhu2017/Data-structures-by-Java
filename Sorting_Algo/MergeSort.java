package Sorting_Algo;
import java.util.*;

class MergeSort{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        //MergeSort alog
        mergeSortAlgo(arr);
        //output
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
    public static void mergeSortAlgo(int[] arr){
        if(arr.length>1){
            int midpoint=arr.length/2;
            int[] left=Arrays.copyOfRange(arr, 0, midpoint);
            int[] right=Arrays.copyOfRange(arr, midpoint,arr.length);
            mergeSortAlgo(left);
            mergeSortAlgo(right);
            int i=0,j=0,k=0;
            while(i<left.length && j<right.length){
                if(left[i]<right[j]){
                    arr[k]=left[i];
                    i++;
                }else{
                    arr[k]=right[j];
                    j++;
                }
                k++;
            }
            while(i<left.length){
                arr[k]=left[i];
                i++;
                k++;
            }
            while(j<right.length){
                arr[k]=right[j];
                j++;
                k++;
            }
        }
    }
}