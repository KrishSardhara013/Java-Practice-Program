//Design program to print a string with TypeWriter effect.

import java.util.Scanner;
public class TypeWriter_effect {
    public static void main(String[] args) {
        int delay;
        String text;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Text :");
        text = in.nextLine();
        System.out.println("Enter Dealyed time:");
        delay = in.nextInt();
        printWithTypewriterEffect(text, delay);
    }
    public static void printWithTypewriterEffect(String text, int delay) {
        try {
            for (int i = 0; i < text.length(); i++) {
                System.out.print(text.charAt(i));
                Thread.sleep(delay);
            }
            System.out.println();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
