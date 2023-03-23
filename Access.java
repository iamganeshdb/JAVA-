package encapsulation;

class Access
{
	public static void main(String[] args) 
	{
	Facebook f=new Facebook();
	System.out.println(f.get_pwd());
	f.set_pwd("ammikondhogale");
	System.out.println(f.get_pwd());
	}
}
