
package subsetofarray;

import java.util.Scanner;


public class SubsetOfArray {

    public static int[][] subsets(int input[]) 
    {
        return subsets(input,0);
    }
    public static int[][] subsets(int input[],int si){
        if(si>=input.length)
        {
            int ans[][]=new int[1][0];
            return ans;
        }
        int[][] smallans=subsets(input,si+1);
        int[][] ans=new int[smallans.length*2][];
        int k=0;
        for(int i=0;i<smallans.length;i++){
            ans[i]=new int[smallans[i].length];
            for(int j=0;j<smallans[i].length;j++){
                ans[i][j]=smallans[i][j];
            }
            k++;
        }
        for(int i=0;i<smallans.length;i++)
        { ans[k+i]=new int[smallans[i].length+1];
          ans[k+i][0]=input[si];
            for(int j=1;j<=smallans[i].length;j++)
            {
                ans[i+k][j]=smallans[i][j-1];
            } 
       
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int [][]ans = subsets(arr);
        for (int[] row : ans){
            // Loop through all columns of current row
            for (int x : row)
                System.out.print(x + " ");
            System.out.println("");
        }
    }
    
}
