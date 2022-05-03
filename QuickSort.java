
package quicksort;

import java.util.Scanner;


public class QuickSort {

    public static void quickSort(int[] input) {    
        quickSort(input,0,input.length-1);	
    }
    
    public static void quickSort(int[] input, int si, int ei)
    {
        if (si>=ei)
        {
            return;
        }
        int pivotIndex=partition(input,si,ei);
        quickSort(input, si, pivotIndex-1);
        quickSort(input,pivotIndex+1,ei);
    }
    
    public static int partition(int[] a, int si, int ei)
    {
        int pivotElement=a[si];
        int smallerEleCount=0;
        for(int i=si+1;i<=ei;i++)
        {
            if (a[i]<pivotElement)
            {
                smallerEleCount++;
            }
        }
        
        int temp=a[si+smallerEleCount];
        a[si+smallerEleCount]=pivotElement;
        a[si]=temp;
        
        int i=si;
        int j=ei;
        while(i<j)
        {
            if (a[i]<pivotElement)
            {
                i++;
            }
            else if (a[j]>=pivotElement)
            {
                j--;
            }
            else
            {
                temp=a[i];
                a[i]=a[j];
                a[j]=temp;
                i++;
                j--;
            }
        }
        
        return si+smallerEleCount;
    }
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter len of array: ");
        int length = sc.nextInt();
        int input[] = new int[length];
        System.out.print("Enter Elements: ");
        for(int i=0; i < length; i++)
          input[i] = sc.nextInt();
        quickSort(input);
        System.out.print("Element in Sorted Order: ");
        for(int i = 0; i < length; i++) {
            System.out.print(input[i]+" ");
        }
        System.out.println("");
    }
    
}
