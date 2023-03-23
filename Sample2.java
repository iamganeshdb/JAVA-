package Exceptionhandling;

public class Sample2 
{
	public static void main(String[] args)
	{
		System.out.println("main starts");
		String s= "methodoveriding";
		try
		{
			System.out.println(s.charAt(19));
		}
		catch(StringIndexOutOfBoundsException e)
		{
		System.out.println("handled");
		}
		System.out.println("main ends");
	}
	}

