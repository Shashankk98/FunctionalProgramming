package in.sb.main.Consumer;

import java.util.function.Consumer;

public class test1 {
	
	public static void main(String[] args) {
		
		Consumer<String> ob = str -> System.out.println("Hi : "+str);
		
		ob.accept("Shashank");
	}

}
