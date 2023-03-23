package Exceptionhandling;

public class Nestedtrycatch
{
	public static void main(String[] args)
	{
	System.out.println("main starts");
	int[]arr= {1,3,5,7,9,11};
	try
	{
		System.out.println(arr[7]);
		try
		{
			int x=1/0;
	}
	catch(ArithmeticException e)
	{
	System.out.println("handled");
	}
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
	System.out.println("addressed");
	}
	System.out.println("main ends");
}
}
