package basicstreams;

import java.awt.Desktop.Action;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class BasicStream {
	
	private static void printMe(int a) {
		System.out.println("a" + a);
	}
	
	public static void main(String[] args) {
		
		List<Number> list = Arrays.asList(3,1,2,3,1,2);
		System.out.println(sum(list));
		System.out.println(count(list));
		
		list.stream().forEach(System.out::println);
		
		//System.out.println(order(list));
	}

	private static long count(List<Number> list) {
		return list.stream().count();
	}

	private static int sum(List<Number> list) {
		
		return 
				//convert the list into a stream
				list.stream()
				//map the stream to int, which has the .sum method for easy adding
				.mapToInt(Number::intValue)
				//call the sum method
				.sum();
	}
}
