
package subsetsumtok;

import java.util.Scanner;
/*
Sample Input :
9 
5 12 3 17 1 18 15 3 17 
6
Sample Output :
3 3
5 1
*/

public class SubsetSumToK {

    public static void printSubsetsSumTok(int input[], int k) {
	int output[]=new int[0];
        helper(input,0,k,output);
    }
    public static void helper(int input[],int si,int k,int output[]){
        if(si==input.length){
            if(k==0)
            {
                for(int i=0;i<output.length;i++){
                    System.out.print(output[i]+" ");
                }
                System.out.println();
                return;
            }
            else
                return;
        }
        helper(input,si+1,k,output);
        int newoutput[]=new int[output.length+1];
        int i=0;
        for( ;i<output.length;i++)
        {
            newoutput[i]=output[i];
        }
            newoutput[i]=input[si];
        helper(input,si+1,k-input[si],newoutput);
  
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
        System.out.print("Enter K value: ");
        int k = sc.nextInt();
        printSubsetsSumTok(arr, k);
    }
    
}
