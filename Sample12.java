package Exceptionhandling;

public class Sample12 
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
	finally
	{
		System.out.println("nanu idini");
	}
	System.out.println("main ends");
	}
}
