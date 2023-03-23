package Exceptionhandling;

public class Sample6
{
	public static void main(String[] args)
	{
	System.out.println("main starts");
	try
	{
		int x=2/0;
	}
	catch(ArithmeticException e)
	{
	System.out.println("handled");
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
	System.out.println("handled");
	}
	System.out.println("main ends");
}
	}
