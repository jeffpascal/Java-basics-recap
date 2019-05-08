package basicstreams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UpperBoundWildcards {
	// ? extends MyClass
	
	//numbers will contain subclasses of Number
	List<? extends Number> numbers = new ArrayList<>();
	
	
	//declaring the list this way, we are allowed to send any type of list
	//that is a subclass of Number using the upperbound wildcard
	public static double sumList(List<? extends Number> list) {
		
		return list.stream()
				//use the doubleValue method on my Number	
				.mapToDouble(Number::doubleValue)//double stream
				.sum();
	}
	
	//this way, you cannot send different types of list
//	public static double sumList2(List<Object> list) {
//		
//		return list.stream().mapToDouble(Number::doubleValue).sum();
//	}
	
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		List<Double> list1 = Arrays.asList(1.1,2.2,3.3,4.2,5.1);
		
		//a list of integer is a subclass of Number so this will work
		//can only use methods on List or Number
		System.out.println(sumList(list));
		System.out.println(sumList(list1));
	}
	

}