package basicstreams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamRandom {
	public static void main(String[] args) {
		
		List<Number> list = 
				//iterate from 0.1 increment by 0.1, map to double
				Stream.iterate(0.1, n -> n+0.1)
				.map(Double::new)
				.limit(10).collect(Collectors.toList());
		
		list.forEach(System.out::println);
		
		
		Stream.of(1,2,3,4,5)
		//using a Consumer
		.forEach(a -> System.out.print(a));
		
		//can also be written as
		Stream.of(1,2,3,4,5)
		//using a Consumer
		.forEach(a -> {
			System.out.print(a);
		});
		
		//can also be written as
		Stream.of(1,2,3,4,5)
		.forEach( (Integer a) -> {
			System.out.print(a);
		 });
		
		//can also be written like this
		Stream.of(3,2,1,1,1).forEach(new Consumer<Integer>() {
			@Override
			public void accept(Integer integer) {
				System.out.println(integer);
			}
		});
		
		/*
		 * defining a consumer separately
		 */
		
		Consumer<Integer> printer = n -> System.out.println(n);
		Stream.of(1,2,3,4).forEach(printer);
		
		List<Integer> list1 = new ArrayList<>();
		
		Stream.of(9,1,2,3,1).forEach(n -> list1.add(n/2) );
		list1.stream().forEach(n -> System.out.println(n));
		
		list1.stream().findAny().equals(0);
	}
}
 