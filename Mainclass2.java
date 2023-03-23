package encapsulation;
class Icici
{
	private int atmpin=1000;
	public int get_atmpin()
	{
		return atmpin;
	}
public void set_atmpin(int atmpin)
{
this.atmpin=atmpin;	
}
}

class Mainclass2 
{
public static void main(String[] args) 
{
Icici i=new Icici();
System.out.println(i.get_atmpin());
i.set_atmpin(2000);

System.out.println(i.get_atmpin());
}
}