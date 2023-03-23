package Collection;

import java.util.ArrayList;

public class Collcetion3
	{
	public static void main(String[] args) 
	{
	ArrayList l1=new ArrayList();
	l1.add(10);
	l1.add('s');
	l1.add(true);
	ArrayList l2=new ArrayList();
	l2.add("hiii");
	l2.add(20.56);
	l2.add(202.3f);
	System.out.println(l1);
	System.out.println(l2);
	l1.addAll(l2);
	System.out.println(l1);
	System.out.println(l2);
}
	}

