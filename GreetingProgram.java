import java.util.Scanner;

public class GreetingProgram {
    public static void main(String[] args){
                Scanner scanner = new Scanner(System.in);

                System.out.print("Enter Your Name : ");

                String name = scanner.nextLine();

                System.out.println("Hello "+name+", Have A Good Day!");

                scanner.close();

    }
}