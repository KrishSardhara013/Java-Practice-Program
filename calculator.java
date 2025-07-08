//Write a program to implement basic calculator

  import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
        double c;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter value 1:");
        int a = in.nextInt();
        System.out.println("Enter value 2:");
        int b = in.nextInt();
        System.out.println("Enter 1 for Add\nEnter 2 for sub\nEnter 3 for mul\nEnter 4 for Div\nEnter 5 for mod");
        System.out.println("Enter Your choice");
        int value = in.nextInt();
        switch (value) {
            case 1:
                c=a+b;
                System.out.println("Addition:"+ c);
                break;
                case 2:
                c=a-b;
                System.out.println("Subtraction:"+ c);
                break;
                case 3:
                c=a*b;
                System.out.println("Multiplication:"+ c);
                break;
                case 4:
                c=a/b;
                System.out.println("Division:"+ c);
                break;
                case 5:
                c=a%b;
                System.out.println("Modulo:"+ c);
                break;
            default:
            System.out.println("Enter Valid choice");
                break;
        }
    }
}
