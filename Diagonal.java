import java.util.*;

class Diagonal{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][] arr=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if((i==0 && j==0) || (i==n-1 && j==n-1)){System.out.print(arr[i][j]+" ");}
                else{
                    int k=i+1;
                    int l=j-1;
                    int c=0;
                    if((k<n && l>=0) && arr[i][j]==arr[k][l]){
                        c=1;
                    }
                    if(c==1){System.out.print(arr[i][j]+" ");}
                }
            }
        }
        sc.close();
    }
}
// 4
// 1 2 3 4
// 2 3 4 5
// 3 4 1 6
// 4 1 6 7