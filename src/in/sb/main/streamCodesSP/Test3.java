package in.sb.main.streamCodesSP;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//WAP to print all the names whose name starts with d
public class Test3 {

	public static void main(String[] args) 
	{
		ArrayList<String> ar = new ArrayList<String>();
		 
		 ar.add("Shashank");
		 ar.add("Pranjali");
		 ar.add("Ram");
		 ar.add("Deepak");
		 ar.add("dhondiram");
		 ar.add("Dhanaji");
		 
		 Stream<String> s = ar.stream();
		 
		 //s.filter(e -> e.startsWith("D")).forEach(e -> System.out.println(e));
		 
		 List l =s.filter(e->e.startsWith("D")).collect(Collectors.toList());
		 System.out.println(l);
	}

}
