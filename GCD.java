//Write a program that prompts the user to enter two integers and compute the gcd of two integers.    ( public static int gcd(int num1, int num2)).


import java.util.Scanner;

public class GCD {
    public static  int gcd(int num1,int num2)
    {
        int gcd=0,i;
        for(i=1;i<=num1&&i<=num2;i++){
            if(num1%i==0 && num2%i==0);
            {
                 gcd=i;
            }
        }
        return gcd;

    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);    
                   System.out.print("Enter number1:");
        int n1= in.nextInt();
        System.out.print("Enter number2:");
        int n2= in.nextInt();
        int gcd = gcd(n1, n2);
       System.out.print("GCD of "+n1+" and "+n2+ " : " +gcd);
        in.close();
    }
}
