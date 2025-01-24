package in.sb.main.streamCodesSP;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

//WAP to Print all the numbers which are greater than 30

//(Functional interfaces, lambda expression, predicate Functional Interface, Stream API)

public class Test1 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> ar = new ArrayList<Integer>();
		
		ar.add(10);
		ar.add(20);
		ar.add(30);
		ar.add(40);
		ar.add(50);

/*
		Stream<Integer> s = ar.stream();
		
		Predicate<Integer> p = (e)->
								{
									return e>20;
								};
		Consumer<Integer> c = (e) ->
								{	
									System.out.println(e);
								};
		s.filter(p).forEach(c);
*/
		
/*
		Stream<Integer> s = ar.stream();					
		s.filter(e->e>20).forEach(e->System.out.println(e));
*/
		ar.stream().filter(e->e>30).forEach(e->System.out.println(e));
		
		
		
	}

}
