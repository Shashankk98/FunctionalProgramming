package in.sb.main.streamCodesSP;

import java.util.ArrayList;
import java.util.stream.Stream;

//WAP to get minimum and maximum element in an ArrayList

public class Test7 {

	public static void main(String[] args) 
	{
		ArrayList<Integer> ar = new ArrayList<Integer>();
		
		ar.add(30);
		ar.add(50);
		ar.add(20);
		ar.add(10);
		ar.add(40);
		
		Stream<Integer> s = ar.stream();
		int min = s.min((x,y)->x.compareTo(y)).get();
		
		Stream<Integer> s1 = ar.stream();
		int max = s1.max((x,y)->x.compareTo(y)).get();
		
		System.out.println(min + " and "+max);
		
	}

}
