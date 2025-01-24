package in.sb.main.streamCodesSP;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//WAP to sort an arraylist containg integer values

public class Test6 {

	public static void main(String[] args) 
	{
		ArrayList<Integer> ar = new ArrayList<Integer>();
		
		ar.add(30);
		ar.add(50);
		ar.add(20);
		ar.add(10);
		ar.add(40);
		
		
		Stream<Integer> s = ar.stream();
		
		//Assneding order
//		s.sorted().forEach(e->System.out.println(e));
//		List l=s.sorted().collect(Collectors.toList());
		
//		List l=s.sorted((x,y)->x.compareTo(y)).collect(Collectors.toList());
		
		List l=s.sorted((x,y)->-x.compareTo(y)).collect(Collectors.toList());
		System.out.println(l);

	}

}
