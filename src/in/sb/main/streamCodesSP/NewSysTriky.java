package in.sb.main.streamCodesSP;

import java.util.ArrayList;

public class NewSysTriky 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> ar = new ArrayList<Integer>();
		
		ar.add(10);
		ar.add(20);
		ar.add(30);
		ar.add(40);
		ar.add(50);
		
		ar.stream().filter(e->e>30).forEach(System.out::println);
		
		
	}

}
