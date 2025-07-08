//Write a program to validate email address.

import java.util.Scanner;
public class valid_email{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter email:");
        String s1 = new String();
        s1=sc.next();

        if(s1.length()<=50){
            if( s1.contains("@") && s1.contains(".") && !s1.contains(" "))
            {
                System.out.println("it is valid email address");
            }
            else{
                System.out.println("it is invalid email address");
            }
        }
        else{
            System.out.println("please enter valid email address");
        }
    }
}
