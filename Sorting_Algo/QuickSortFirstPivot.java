import java.util.*;
class QuickSortFirstPivot{
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
        int i=low+1;
        for(int j=low+1;j<=high;j++){
            if(arr[j]<=pivot){
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
                i++;
            }
        }
        int temp=arr[i-1];
        arr[i-1]=arr[low];
        arr[low]=temp;
        return(i-1);
    }
}
