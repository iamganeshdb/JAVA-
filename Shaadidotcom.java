package Exceptionhandling;

public class Shaadidotcom
{
	static void Submit() throws Exception
	{
int age=17;
if(age>21)
{
	System.out.println("sukhajeevana");
}
else
{
	throw new Shaadiexception("invalid age");
}
}
public static void main(String[] args) throws Exception
{
try
{
	Submit();
}
catch(Shaadiexception e)
{
System.out.println(e.getmessage());	
}
}
}

