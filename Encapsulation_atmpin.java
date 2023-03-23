package encapsulation;
	class Encapsulation_atmpin
	{
	private int a=23;
	public int get_a()
	{
		return a;
	}
	public void set_a(int a)
	{
			this.a=a;
}
}

 class Mainclass1 
 {
public static void main(String[] args) 
{
	Sample s=new Sample();
			System.out.println(s.get_a());
	s.set_a(200);
	System.out.println(s.get_a());
}
}
