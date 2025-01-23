package in.sb.main.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

//How to get Stream Instance !!!!

public class test1 
{
	public static void main(String[] args) 
	{
		
		ArrayList<Integer> ar = new ArrayList<>();
		
		ar.add(10);
		ar.add(20);
		ar.add(30);
		ar.add(40);
		ar.add(50);
		ar.add(60);
		ar.add(70);
		ar.add(80);
		
		//1st way to get Stream Instance.....
		Stream<Integer> s1 = ar.stream();
		s1.forEach(e -> System.out.println(e));
		
		//2st way to get Stream Instance.....
//		Stream s2 =  Stream.of(ar);
//		s2.forEach(e -> System.out.println(e));
		
		//3rd way to get Stream Instance.....
//		Stream<String> s3 = Stream.of("Shashank","Onkar","Manoj","Madhura","Pranjali");
//		s3.forEach(e -> System.out.println(e));
		
		//4th way to get Stream Instance.....
//		int[] arr = {100,200,300,400,500};
//		IntStream s4 = Arrays.stream(arr);
//		s4.forEach(e -> System.out.println(e));
		
		//5th way to get Stream Instance.....
//		Stream s5 = Stream.empty();
		
		//6th way to get Stream Instance.....
//		Stream s6 = Stream.builder().build();
		
		
		
		
	}

}
