package basicstreams;

import java.awt.Desktop.Action;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BasicStream {
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(3,1,2,3,1,2);
		System.out.println(sum(list));
		System.out.println(count(list));
		//System.out.println(order(list));
	}

	private static long count(List<Integer> list) {
		return list.stream().count();
	}

	private static int sum(List<Integer> list) {
		
		return 
				//convert the list into a stream
				list.stream()
				//map the values of the stream in int
				.mapToInt(Number::intValue)
				//call the sum method
				.sum();
	}
}
