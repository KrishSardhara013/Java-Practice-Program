//Write a program to do matrix multiplication (3*3). 

import java.util.Scanner;
public class matrix {
    public static void main(String[] args)
    {
        int size=3,i,j=0,k;
        int [][] m1= new int[size][size];
        int [][] m2= new int [size][size];
        int [][] result= new int[size][size];
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Element in Matrix1::");
        for(i=0;i<=size-1;i++)
        {
            for(j=0;j<=size-1;j++)
            {
                // System.out.println("Enter element:");
                m1[i][j] = in.nextInt();
            }
        }
    System.out.println("Enter Element in Matrix2::");
    for(i=0;i<=size-1;i++)
    {
        for(j=0;j<=size-1;j++)
        {
            // System.out.println("Enter element:");
            m2[i][j] = in.nextInt();
        }
    }
    for(i=0;i<=size-1;i++)
    {
        for(j=0;j<=size-1;j++)
        {
            result[i][j]=0;
            for(k=0;k<=size-1;k++)
            {
                result[i][j] += m1[i][k] * m2[k][j];
            }
            System.out.println(result[i][j] + " \t");
        }
        System.out.println();
    }
}
}
