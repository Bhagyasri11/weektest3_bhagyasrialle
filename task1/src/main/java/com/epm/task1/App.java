package com.epm.task1;
import java.util.Scanner;
class Arithmetic
{
	void addition()
	{
		double a,b;
		double result;
		Scanner rc=new Scanner(System.in);
		System.out.println("Addition");
		System.out.println("\n a: ");
		a=rc.nextDouble();
		System.out.println("\n b: ");
		b=rc.nextDouble();
		rc.close();
		result=a+b;
		System.out.print((double)result);
	}
	void subtraction()
    {
		double a,b;
		double result;
		Scanner rc=new Scanner(System.in);
		System.out.println("Subtraction");
		System.out.println("\n a: ");
		a=rc.nextDouble();
		System.out.println("\n b: ");
		b=rc.nextDouble();
		rc.close();
		result=a-b;
		System.out.println((double)result);
	}
	void multiplication()
	{
		double a,b;
		double result;
		Scanner rc=new Scanner(System.in);
		System.out.println("Multiplication:");
		System.out.println("\n a: ");
		a=rc.nextDouble();
		System.out.println("\n b: ");
		b=rc.nextDouble();
		rc.close();
		result=a*b;
		System.out.println((double)result);
	}
	void division()
	{
		double a,b;
		double result;
		Scanner rc=new Scanner(System.in);
		System.out.println("Division:");
		System.out.println("\n a: ");
		a=rc.nextDouble();
		System.out.println("\n b: ");
		b=rc.nextDouble();
		rc.close();
		result=a/b;
		System.out.println((double)result);
		
	}
}

public class App 
{
    public static void main( String[] args )
    {
    	Scanner rc=new Scanner(System.in);
    	System.out.println("Simple calculator");
        System.out.print("\nHere are your options:");
        System.out.print("\n1.Addition");
        System.out.print("\n2.Subtraction");
        System.out.print("\n3.Multiplication");
        System.out.print("\n4.Division");
        System.out.print("\nWhat do you like to do?:");
        int choice = rc.nextInt();
        System.out.println();
        switch(choice)
        {
        case 1:
        	Arithmetic ar=new Arithmetic();
        	ar.addition();
        	break;
        case 2:
        	Arithmetic ab=new Arithmetic();
        	ab.subtraction();
        	break;
        case 3:
        	Arithmetic ac=new Arithmetic();
        	ac.multiplication();
        	break;
        case 4:
        	Arithmetic ad=new Arithmetic();
        	ad.division();
        	break;
        	
        }
        System.out.println();
        rc.close();
        
    }
}
