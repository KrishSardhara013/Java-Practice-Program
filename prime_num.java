//Write a program to display first n prime numbers. 

 import java.util.Scanner;
public class prime_num {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();
        int count = 0, num = 2;
        while (count < n) {
           int flag=0;
            if (num < 2) {
                flag=1;
            } else {
                for (int i = 2; i * i <= num; i++) {
                    if (num % i == 0) {
                        flag=1;
                        break;
                    }
                }
            }

            if (flag==0) {
                System.out.print(num + " ");
                count++;
            }
            num++;
        }
    }
}
