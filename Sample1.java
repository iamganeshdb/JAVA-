package Exceptionhandling;

public class Sample1 
{
public static void main(String[] args)
{
	System.out.println("main starts");
	try
	{
	int x=1/0;
	}
	catch(ArithmeticException e)
	{
		System.out.println("handled");
	}
	System.out.println("main ends");
}
}