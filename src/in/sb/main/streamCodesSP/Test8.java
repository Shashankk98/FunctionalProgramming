package in.sb.main.streamCodesSP;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

//WAP to print the sum of all the even numbers in an ArrayList
public class Test8 {

	public static void main(String[] args) 
	{
		ArrayList<Integer> ar = new ArrayList<Integer>();
		
		ar.add(3);
		ar.add(5);
		ar.add(2);
		ar.add(8);
		ar.add(4);
		
		Stream<Integer> s = ar.stream();
		
		//List l = s.filter(e-> e%2==0).collect(Collectors.toList());
		
/*		
		Stream<Integer> s2 = s.filter(e->e%2==0); //Get all even number stream
		IntStream is = s2.mapToInt(Integer :: intValue); //convert the stream into InstStream
		System.out.println(is.sum()); //sum all the numbers present in IntStream
*/
		
		int res = s.filter(e->e%2==0).mapToInt(Integer :: intValue).sum();
		
		System.out.println(res);

	}

}
