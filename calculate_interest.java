//  Write a program to create interface and declare one mehtod interest(p,r,n) then create two class SimpleInterest and CompoundInterest and calculate simple and compound interest.

import java.util.Scanner;
interface Interest {
    double interest(double p, double r, double n);
}
class simpleinterest implements Interest {
    @Override
    public double interest(double p, double r, double n) {
        return (p * r * n) / 100;
    }
}
class compoundinterest implements Interest {
    @Override
    public double interest(double p, double r, double n) {
        return (p * (Math.pow((1 + r / 100), n)) - p);
    }
}
public class calculate_interest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double principal, rate, time, simpleint, compint;
        Interest simplecalc = new simpleinterest();
        Interest compoundcalc = new compoundinterest();
        System.out.println("Enter prinicpal amount:");
        principal = in.nextDouble();
        System.out.println("Enter rate of interset:");
        rate = in.nextDouble();
        System.out.println("Enter time period:");
        time = in.nextDouble();
        simpleint = simplecalc.interest(principal, rate, time);
        compint = compoundcalc.interest(principal, rate, time);
        System.out.println("Simple Interset:" + simpleint);
        System.out.println("Compound interset:" + compint);
    }
}
