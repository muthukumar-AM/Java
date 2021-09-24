package calculator;

import java.util.Scanner;

public class Calculator {
	 
	public static int addition(int num1,int num2) {
		return num1+num2;
		
	}
	public static int subtraction(int num1,int num2) {
		return num1-num2;
	}
	public static int multiplication(int num1,int num2) {
		return num1*num2;
	}
	public static int division(int num1,int num2) {
		return num1/num2;
	}
	public static int modulo(int num1,int num2) {
		return num1%num2;
	}
	public static int maximum(int num1,int num2) {
		if(num1>num2) {
			return num1;
		}
		else {
			return num2;
		}
		
	}
	public static int minimum(int num1,int num2) {
		if(num1<num2) {
			return num1;
		}
		else {
			return num2;
		}
		
	}
	public static int average(int num1,int num2) {
		int sum=num1+num2;
		int average=sum/2;
		return average;
		
	}
	
	
	public static void main(String[] args) {
		int number1,number2,result,option;
		Scanner sc=new Scanner(System.in);
		do {
			
			System.out.println("Choose your option :");
			System.out.println("1.Addition :");
			System.out.println("2.Subtraction :");
			System.out.println("3.Multiplication :");
			System.out.println("4.Division :");
			System.out.println("5.Modulo :");
			System.out.println("6.Maximum :");
			System.out.println("7.Minimum :");
			System.out.println("8.Average :");
			System.out.println("9.Exit :");
			System.out.print("Enter your option :");
			option=sc.nextInt();
			switch(option) {
			case 1:
				System.out.print("Enter the 1st number :");
				number1=sc.nextInt();
				System.out.print("Enter the 2nd number :");
				number2=sc.nextInt();
				result=addition(number1,number2);
				System.out.println("Result :"+result);
				break;
			case 2:
				System.out.print("Enter the 1st number :");
				number1=sc.nextInt();
				System.out.print("Enter the 2nd number :");
				number2=sc.nextInt();
				result=subtraction(number1,number2);
				System.out.println("Result :"+result);
				break;
			case 3:
				System.out.print("Enter the 1st number :");
				number1=sc.nextInt();
				System.out.print("Enter the 2nd number :");
				number2=sc.nextInt();
				result=multiplication(number1,number2);
				System.out.println("Result :"+result);
				break;
			case 4:
				System.out.print("Enter the 1st number :");
				number1=sc.nextInt();
				System.out.print("Enter the 2nd number :");
				number2=sc.nextInt();
				result=division(number1,number2);
				System.out.println("Result :"+result);
				break;
			case 5:
				System.out.print("Enter the 1st number :");
				number1=sc.nextInt();
				System.out.print("Enter the 2nd number :");
				number2=sc.nextInt();
				result=modulo(number1,number2);
				System.out.println("Result :"+result);
				break;
			case 6:
				System.out.print("Enter the 1st number :");
				number1=sc.nextInt();
				System.out.print("Enter the 2nd number :");
				number2=sc.nextInt();
				result=maximum(number1,number2);
				System.out.println("Result :"+result);
				break;
			case 7:
				System.out.print("Enter the 1st number :");
				number1=sc.nextInt();
				System.out.print("Enter the 2nd number :");
				number2=sc.nextInt();
				result=minimum(number1,number2);
				System.out.println("Result :"+result);
				break;
			case 8:
				System.out.print("Enter the 1st number :");
				number1=sc.nextInt();
				System.out.print("Enter the 2nd number :");
				number2=sc.nextInt();
				result=average(number1,number2);
				System.out.println("Result :"+result);
				break;
				
			case 9:
				sc.close();
				System.exit(0);
				
			default:
				System.out.println("no such option :");
				
			}
			
			
		}while(true);
		
		
		
	}

}
