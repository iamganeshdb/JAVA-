package Exceptionhandling;

public class Sample3 
{
	public static void main(String[] args)
	{
	System.out.println("main starts");
	String s= null;
	try
	{
		System.out.println(s.hashCode());
	}
	catch(NullPointerException e)
	{
	System.out.println("handled");
	}
	System.out.println("main ends");
}
}