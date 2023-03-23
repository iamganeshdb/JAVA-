package Exceptionhandling;

public class Sample11 
{
	public static void main(String[] args)
	{
	System.out.println("main starts");
	int[]arr= {1,3,5,7,9,11};
	try
	{
		System.out.println(arr[7]);
	}
	finally
	{
		System.out.println("nanu idini");
	}
	System.out.println("main ends");
	}
}