/*  Create a class named 'Member' having the following members:
1 – Name        2 – Age       3 - Phone number         4 – Address        5 - Salary
It also has a method named 'printSalary' which prints the salary of the members.
Two classes 'Employee' and 'Manager' inherits the 'Member' class. The 'Employee' and 'Manager' classes have data members ' specialization' and 'department' respectively. No, assign name, age, phone number, address and salary to an employee and a manager by making an object of both of these classes and print the same along with specialization and department respectively.
*/
class member {
    String name, address, phn_no;
    int age;
    double salary;
    public member(String name, int age, String phn_no, String address, double salary) {
        this.name = name;
        this.age = age;
        this.phn_no = phn_no;
        this.address = address;
        this.salary = salary;
    }
    public void salary() {
        System.out.println("Salary" + salary);
    }
}
class Employee extends member {
    String specialization;

    public Employee(String name, int age, String phn_no, String address, double salary, String specialization) {
        super(name, age, phn_no, address, salary);
        this.specialization = specialization;
    }
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Phone Number: " + phn_no);
        System.out.println("Address: " + address);
        salary();
        System.out.println("Specialization: " + specialization);
    }
}
class Manager extends member {
    String department;
    public Manager(String name, int age, String phn_no, String address, double salary, String department) {
        super(name, age, phn_no, address, salary);
        this.department = department;
    }
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Phone Number: " + phn_no);
        System.out.println("Address: " + address);
        salary();
        System.out.println("Department: " + department);
    }
}
public class Member_Details{
    public static void main(String[] args) {
        Employee e = new Employee("Hariom", 18, "9081900063", "Rajkot", 2500000, "Database");
        e.display();
        System.out.println();
        Manager m = new Manager("Xyz", 40, "8989898989", "Rajkot", 5000000, "Computer");
        m.display();
    }
}
