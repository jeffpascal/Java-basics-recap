package threads;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UseRunnable {
	public static void main(String[] args) {
		List<MyRunnable> threads = 
				//rule for creating creates ints from 0 to infinity incrementing by 2 unless limit is specified
				Stream.iterate(0, n -> n+1)
				//create 10 myThread
				.map(MyRunnable::new)
				//here set the limit
				.limit(10)
				.collect(Collectors.toList());
		
		threads.forEach(MyRunnable::start);
	}
}
