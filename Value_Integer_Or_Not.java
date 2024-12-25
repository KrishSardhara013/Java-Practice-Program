import java.util.Scanner;

public class Value_Integer_Or_Not {
    public static void main(String[] args) {
        System.out.println("Enter Number check it is integer or not : ");
        Scanner s = new Scanner(System.in);
        boolean b1 = s.hasNextInt();
        System.out.println(b1);
    }
}
