package in.sb.main.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//WAP to print all even Numbers from a arrayList !!

public class StreamAPIAllCodes 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> ar = new ArrayList<Integer>();
		ar.add(100);
		ar.add(200);
		ar.add(3333);
		ar.add(4433);
		ar.add(50);
		
		ArrayList<String> arr = new ArrayList<>();
		arr.add("ram");
		arr.add("Pranj");
		arr.add("Onkar");
		arr.add("dadhura");
		arr.add("sushant");
		
		ArrayList ar1 = new ArrayList();
		
		ar1.add(ar);
		ar1.add(arr);
		
		//Normal way	
//		for(int i : ar)
//		{
//			if(i%2==0)
//			{
//				System.out.println(i);
//			}
//		}
		
		//Using stream API
//		Stream<Integer> s = ar.stream();
//		List<Integer> l = s.filter(e-> e%2==0).collect(Collectors.toList());
//		System.out.println(l);
		
		
		//WAP to find count of even numbers in an array List
//		System.out.println(ar.stream().filter(e->e%2==0).count());
		
		//WAP to Print all The numbers which are greater than 
//		List<Integer> l =ar.stream().filter(e-> e>250).collect(Collectors.toList());
//		System.out.println(l);
		
		//WAP to print all the String values Whose length is grater than 5
//		List l =arr.stream().filter(e->e.length()>5).collect(Collectors.toList());
//		System.out.println(l);
		
		//WAP to print all the names whose name started with d
//		List l = arr.stream().filter(e->e.startsWith("d")).collect(Collectors.toList());
//		System.out.println(l);
		
		//WAP a program to get the first character of each name
//		List l = arr.stream().map(e-> e.charAt(0)).collect(Collectors.toList());
//		System.out.println(l);
		
		//WAP to replace a charector with z
//		List l =arr.stream().map(e-> e.replace(e.charAt(1), 'z')).collect(Collectors.toList());
//		System.out.println(l);
		
		//WAP to Sort Array List contain integer values
		
		// Flatten the nested lists and extract only integers
//        List<Integer> l = (List<Integer>) ar1.stream()
//                .flatMap(e -> ((List<?>) e).stream()) // Flatten the nested lists
//                .filter(e -> e instanceof Integer)   // Filter integers
//                .map(e -> (Integer) e)               // Cast to Integer
//                .collect(Collectors.toList());
//
//        System.out.println(l);
        
/*
		    Explanation For Above !!!!!!
			1.	flatMap(e -> ((List<?>) e).stream()):
			•	Flattens the nested lists inside ar1 into a single stream of elements.
			•	Casts each element to List<?> so it can be processed as a list.
			2.	filter(e -> e instanceof Integer):
			•	Filters out only the integers from the combined stream.
			3.	map(e -> (Integer) e):
			•	Casts the filtered integers back to the Integer type.
			4.	collect(Collectors.toList()):
			•	Collects the processed integers into a list.
*/
		
		//WAP to Get Min And MAX Number form ArrayList
		
//		Optional<Integer> min = ar.stream().min(Integer::compareTo);
//		//System.out.println(min.orElse(-1));
//		System.out.println(min.get());
//		
//		Optional<Integer> MAX = ar.stream().max(Integer::compareTo);
//		//System.out.println(MAX.orElse(-1));
//		System.out.println(MAX.get());
		
		
		//WAP to Print SUm of all the even numbers in an ArrayList
//		int Sum = ar.stream().filter(e->e%2==0).mapToInt(Integer:: intValue).sum();
//		System.out.println(Sum);
		

		
        
		
	}

}
