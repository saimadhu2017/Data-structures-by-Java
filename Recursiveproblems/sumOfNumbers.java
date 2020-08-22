package Recursiveproblems;
class sumOfNumbers{
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,100,20,30};
        System.out.println(sumOfArray(arr,0));
    } 
    static int sumOfArray(int[] arr,int i){
        if(i<arr.length){
            return(arr[i]+sumOfArray(arr,i+1));
        }
        return(0);
    }  
}