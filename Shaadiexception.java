package Exceptionhandling;

public class Shaadiexception extends Exception 
{
String msg;
	Shaadiexception(String msg)
	{
	this.msg=msg;
	}

	public  String getmessage()
{
		return msg;
}
}
