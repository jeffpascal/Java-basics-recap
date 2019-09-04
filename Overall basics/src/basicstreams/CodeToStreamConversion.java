package basicstreams;

import java.util.stream.Stream;

public class CodeToStreamConversion {
	
	public static void streamForLoop(Integer[] array) {
		System.out.printf("\n%s" , "stream for loop, Normal printing: ");
		Stream<Integer> stream = Stream.of(array);
		stream.forEach(System.out::print);
		
		System.out.printf("\n%s" , "stream for loop, Modifying the value in the array: ");
		Stream<Integer> stream2 = Stream.of(array);
		stream2.map(a -> a+1).forEach(System.out::print);
		
		System.out.printf("\n%s" , "stream for loop, Modifying the value in the array: ");
		Stream<Integer> stream3 = Stream.of(array);
		stream3.map(a -> a+1).map(a -> auxiliaryMethod(a)).forEach(System.out::print);
		
		System.out.printf("\n%s" , "stream for loop, Modifying the value in the array: ");
		Stream<Integer> stream4 = Stream.of(array);
		stream4.forEach(i -> {
			if(i%2 == 0)
				i=auxiliaryMethod(i);
			i = i+1;
			System.out.print(i + " ");
		});
		
		
	}
	
	public static void forLoop(Integer[] array) {
		System.out.printf("\n%s" , "normal for loop: ");
		for(int i = 0 ; i < array.length ; i++) {
			System.out.printf("%d" , array[i]);
		}
		
		System.out.printf("\n%s" , "for loop, Modifying the value in the array: ");
		for(int i = 0 ; i < array.length ; i++) {
			System.out.printf("%d" , array[i]+1);
		}
		
		System.out.printf("\n%s" , "for loop, with methods ");
		for(int i = 0 ; i < array.length ; i++) {
			array[i] = array[i] + 1;
			array[i] = auxiliaryMethod(array[i]);
			System.out.printf("%d" , array[i]);
		}
		
		System.out.printf("\n%s" , "for loop, with methods ");
		for(int i = 0 ; i < array.length ; i++) {
			if(i%2 == 0)
				array[i] = auxiliaryMethod(array[i]);
			array[i] = array[i] + 1;
			System.out.printf("%d" , array[i]);
		}
	}
	
	public static int auxiliaryMethod(int i) {
		i = i - 100;
		return i;
	}
	
	public static void main(String[] args) {
		
		//normal printing
		Integer[] array = new Integer[] {1,2,3,4,5};
		streamForLoop(array);
		forLoop(array);
		
		

		
	}
}
