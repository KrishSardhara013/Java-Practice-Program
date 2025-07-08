//Write a program to validate GTU enrollno.

import java.util.Scanner;
public class valid_enrollnum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Enrollment no :");
        String s1= new String();
        s1=in.next();
        int flag=0;
        for(char c:s1.toCharArray()){
            if(Character.isDigit(c) && s1.length()==12 && !s1.contains(" ")){}
            else
            {
                flag=1;
                break;
            }
        }
        if (flag==0)
        {
            System.out.println("Enrollment no is valid");
        }
        else{
            System.out.println("Enrollment no is not  valid");
    }
    }
    
}
