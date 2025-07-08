//Write a program to check given Strings are anagram or not.

import java.util.Arrays;
import java.util.Scanner;

public class anagram {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String 1:");
        String s1 = sc.nextLine();
        System.out.println("Enter String 2:");
        String s2 = sc.nextLine();
        if(s1.length() == s2.length())
        {
            s1 = s1.toLowerCase();
            s2= s2.toLowerCase();
           char [] arr1 = s1.toCharArray();
           char [] arr2 = s2.toCharArray();
           Arrays.sort(arr1);
            Arrays.sort(arr2);
            if(Arrays.equals(arr1, arr2))
            {
                System.out.println("String is anagram");
            }
            else
            {
                System.out.println("String Is not anagram");
            }
        }
        else
        {
            System.out.println("String length is not same");
        }
    }
}
