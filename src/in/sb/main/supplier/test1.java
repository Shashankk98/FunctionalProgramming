package in.sb.main.supplier;

import java.util.function.Supplier;

public class test1 {
	
	public static void main(String[] args) {
		
		Supplier<Integer> ob = () -> (int)(Math.random()*100);
		
		System.out.println(ob.get());
	}

}
