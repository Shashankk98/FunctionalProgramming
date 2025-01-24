package in.sb.main.streamCodesSP;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//WAP to print all the string values whose length is greater than 5
public class Test2 
{
	public static void main(String[] args) {
		 ArrayList<String> ar = new ArrayList<String>();
		 
		 ar.add("Shashank");
		 ar.add("Pranjali");
		 ar.add("Ram");
		 ar.add("Madhura");
		 ar.add("Onkar");
		 ar.add("Manoj");
		 
		 //ar.stream().filter(e->e.length()>5).forEach(e->System.out.println(e));
		 
		 List<String> l = ar.stream().filter(e->e.length()>5).collect(Collectors.toList());
		 System.out.println(l);
	
	}

}
