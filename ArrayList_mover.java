/* 
Create ArrayList mover. In which selected element of one list moved to another.
Subject Selected Subject :- Java,DAA,Maths-1,EME,Database
Lets move Java and DAA to selected subject
Subject : Maths-I       EME    Database           Selected  Subject :    Java      DAA
*/
import java.util.ArrayList;
import java.util.Scanner;
public class ArrayList_mover {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        ArrayList<String> s1 = new ArrayList<>();
        ArrayList<String> s2 = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter Subject name:");
            String s = in.nextLine();
            s1.add(s);   }
        System.out.println(s1);
        String ch = "yes";
        do {
            System.out.print("Enter Index to move:");
            int n = in.nextInt();
            if (n >= 0 && n < s1.size()) {
                String s = s1.remove(n);
                System.out.println(s1);
                s2.add(s);
                System.out.println("Moved sucessfully");
            } else 
                System.out.println("Wrong index:");
            System.out.print("If you want to move more then enter yes :");
            ch = sc.nextLine();
        } while (!ch.equalsIgnoreCase("no"));
        System.out.println("After moving Subjects:");
        System.out.println(s1);
        System.out.println(s2);
    }}
