//Write a program to calculate area of circle, triangle and square using the    concept of method overloading.

import java.util.Scanner;
 class area1{
    Scanner in = new Scanner(System.in);
    public void area(double l)
    {
        System.out.println("Area of Square is : " +(l*l));
    }
    public void area(double h,double b){
        System.out.println("Area of triangle is : "+(0.5*b*h) );
    }
    public void area(){
            System.out.println("Enter radius: ");
            double r = in.nextInt();
            System.out.println("Area of circle is : " +(Math.PI*r*r));
    }
}
public class area_overload {
    public static void main(String[] args) {
        int choice ;
        Scanner in = new Scanner(System.in);
        // 1.Circle area
        // 2.Triangle area
        // 3. Square area
        area1 a = new area1();
        do{
            System.out.print("Enter choice:");
            choice = in.nextInt();
        switch (choice) {
            case 1:
                a.area();
                break;
                case 2:
                System.out.print("Enter Heigth:");
                double h = in.nextDouble();
                System.out.print("Enter Base:");
                double b = in.nextDouble();
                a.area(h,b);
                break;
                case 3:
                System.out.print("Enter Length:");
                double l = in.nextDouble();
                a.area(l);
                break;
               case 4:
              System.out.println("Exiting....");
              break;
            default:
            System.out.println("Enter rigth choice:");
                break;
        }
    }while (choice!=4); 
        in.close();  
    }
}