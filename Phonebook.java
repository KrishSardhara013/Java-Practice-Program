//You are given a phone book that consists of people's names and their phone number. After that you will be given some person's name as query. For each query, print the phone number of that person.

import java.util.HashMap;
import java.util.Scanner;

public class Phonebook {
    public static void main(String[] args) {
        HashMap<String, String> data = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        data.put("ABC", "06309");
        data.put("XYZ", "82003");
        data.put("LMN", "98987");
        data.put("EFG", "94278");

        while (true) {
            System.out.println("Enter name to find number or enter Exit:");
            String query = sc.nextLine();
            if (query.equalsIgnoreCase("exit")) {
                System.out.println("Exiting...");
                break;
            }
            String num = data.get(query);
            if (num != null) {
                System.out.println("Name  : " + query + "Number :" + num);
            } else {
                System.out.println("Not Found");
            }
        }
    }
}
