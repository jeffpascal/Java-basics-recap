package basicstreams;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

//Unbounded WildCards ? operator
public class WildCards {
	//this works fine
	static List<?> stuff = Arrays.asList(new Date(), "gome" , new Object(), Arrays.asList(1,2));
	
	public static void main(String[] args) {
		//for each object o   -> will execute the acton of printing of o
		stuff.forEach((Object o) -> System.out.println(o));
		//wont work
		//stuff.add();
		
	}
}
