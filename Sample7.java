package Exceptionhandling;

public class Sample7
{
	public static void main(String[] args)
	{
	System.out.println("main starts");
	try
	{
		int x=2/0;
	}
	catch(Exception e)
	{
	System.out.println("handled");
	}
	System.out.println("main ends");
}
}