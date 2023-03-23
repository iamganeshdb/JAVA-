package Exceptionhandling;

public class Exceptionhandling4
{
	public static void main(String[] args)
	{
	System.out.println("main starts");
	int[]arr= {1,3,5,7,9,11};
	try
	{
		System.out.println(arr[7]);
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
	System.out.println("handled");
	}
	System.out.println("main ends");
}
}
