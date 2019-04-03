package basicstreams;

import java.util.List;
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
	}
}
 