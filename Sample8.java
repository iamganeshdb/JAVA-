package Exceptionhandling;

public class Sample8 
{
	public static void main(String[] args)
	{
	System.out.println("main starts");
	String s= null;
	try
	{
		System.out.println(s.hashCode());
		System.out.println("hiii");
	}
	catch(NullPointerException e)
	{
	System.out.println("handled");
	}
	System.out.println("main ends");
}
}
