
package rational;

import java.util.Scanner;

public class Rational {
    private int num;
    private int denom;
    public Rational(){
        num = 0;
        denom = 1;
    }
    public Rational(int x,int y){
        if(y == 0){
            throw new RuntimeException("Denominator is zero");
        }
        int g = gcd(Math.abs(x),Math.abs(y));
        num = x/g;
        denom = Math.abs(y)/g;
        
    }
    public Rational add(Rational r){
        int numerator = (this.num *r.denom) + (this.denom *r.num);
        int denominator = this.denom * r.denom;
        return new Rational(numerator, denominator);
    }
    public Rational subtract(Rational r){
        int numerator = (this.num *r.denom) - (this.denom *r.num);
        int denominator = this.denom * r.denom;
        return new Rational(numerator, denominator);
    }
    public Rational Multiply(Rational r){
        return new Rational(this.num * r.num , this.denom * r.denom);
    }
    public Rational Divide(Rational r){
        return new Rational(this.num * r.denom , this.denom * r.num);
    }
    @Override
    public String toString(){
        if(this.denom == 1) return this.num + "";
        else return this.num + "/" + this.denom;
    }
    private static int gcd(int x, int y) {
        int r = x %y;
        while(r!=0){
            x = y;
            y = r;
            r = x%y;
        }
        return y;
    }
    
    public static void main(String[] args) {
        Rational a,b,z;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st Rational Number: ");
        System.out.print("Enter numerator: ");
        int num1 = sc.nextInt();
        System.out.print("Enter Denominator: ");
        sc = new Scanner(System.in);
        int denom1 = sc.nextInt();
        System.out.println("Enter 2nd Rational Number: ");
        System.out.print("Enter numerator: ");
        sc = new Scanner(System.in);
        int num2 = sc.nextInt();
        System.out.print("Enter Denominator: ");
        sc = new Scanner(System.in);
        int denom2 = sc.nextInt();
        a = new Rational(num1, denom1);
        b = new Rational(num2, denom2);
        z = a.add(b);
        System.out.println("Sum of two rational Number: "+a.toString()+" + "+b.toString()+" = " +z.toString() );
        z = a.subtract(b);
        System.out.println("Difference of two rational Number: "+a.toString()+" - "+b.toString()+" = " +z.toString() );
        z = a.Multiply(b);
        System.out.println("Product of two rational Number: "+a.toString()+" * "+b.toString()+" = " +z.toString() );
        z = a.Divide(b);
        System.out.println("Division of two rational Number: "+a.toString()+" * "+b.toString()+" = " +z.toString() );
        String g  = ((double)(num1/denom1) > (double)(num2/denom2))?a.toString():b.toString();
        if(g.equals(a.toString())){
            System.out.println(b.toString()+" is less than "+ a.toString());
        }else{
            System.out.println(a.toString()+" is less than "+ b.toString());
        }
    }

    
}
