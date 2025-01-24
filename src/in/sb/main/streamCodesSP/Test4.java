package in.sb.main.streamCodesSP;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


//WAP to get the first charecter of each name
public class Test4 
{
	public static void main(String[] args) {
		ArrayList<String> ar = new ArrayList<String>();
		 
		 ar.add("Shashank");
		 ar.add("Pranjali");
		 ar.add("Ram");
		 ar.add("Deepak");
		 ar.add("dhondiram");
		 ar.add("Dhanaji");
		 
		 Stream<String> s = ar.stream();
		 
		 //s.map(e->e.charAt(0)).forEach(e->System.out.println(e));
		 
		 List l =s.map(e->e.charAt(0)).collect(Collectors.toList());
		 
		 System.out.println(l);
		 
		 
	}

}
