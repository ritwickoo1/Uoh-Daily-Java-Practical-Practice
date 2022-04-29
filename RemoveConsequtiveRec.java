
package removeconsequtiverec;

import java.util.Scanner;

/*
Given a string S, remove consecutive duplicates from it recursively.
Input Format :
String S
Output Format :
Output string
Constraints :
1 <= |S| <= 10^3
where |S| represents the length of string
Sample Input 1 :
aabccba
Sample Output 1 :
abcba
Sample Input 2 :
xxxyyyzwwzzz
Sample Output 2 :
xyzwz
*/
public class RemoveConsequtiveRec {
    public static String removeConsecutiveRec(String s){
        if (s.length()<=1)
        {
            return s;
        }
        String smallOutput=removeConsecutiveRec(s.substring(1));
        if (s.charAt(0)==s.charAt(1))
        {
            return smallOutput;
        }
        else
        {
            return s.charAt(0)+smallOutput;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        System.out.println(removeConsecutiveRec(str));
    }
    
}
