//Define a class Student with name of student, department, and 3 subject marks as data members. Define methods to enter details of 5 students, print details of the entered students and sort details of the students on the base of their percentage.

import java.util.Scanner;
class Student {
    String name,Dept_name;
    int m1,m2,m3;	
    double percentage;
    void enter_details(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter name:");
        name = in.nextLine();
        System.out.print("Enter Department :");
        Dept_name = in.nextLine();
        System.out.println("Enter marks for 3 Subject:");
        m1=in.nextInt();
        m2=in.nextInt();
        m3=in.nextInt();
        percentage = (m1+m2+m3)/3;
    }
    void print(){
        System.out.println(name+" "+Dept_name+ " "+percentage+" %");
    }
}

public class Student_Details {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Size :");
        int size = in.nextInt();
        Student[] student = new Student[size];
        for(int i=0;i<size;i++)
        {
            student[i]=new Student();
            student[i].enter_details();
        }
        for(int i =0;i<size-1;i++)
        {
            for(int j=i+1;j<size;j++)
            {
                if(student[i].percentage<student[j].percentage)
                {
                    Student temp = student[i];
                    student[i]=student[j];
                    student[j]=temp;
                }
            }
        }
        System.out.println("Sorted Student Details::");
        for(Student s:student)
        {
            s.print();
        }
        in.close();
    }
}
