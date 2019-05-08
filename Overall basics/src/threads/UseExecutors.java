package threads;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UseExecutors {
	public static void main(String[] args) {
		List<MyRunnable> runnables = 
				//rule for creating creates ints from 0 to infinity incrementing by 2 unless limit is specified
				Stream.iterate(0, n -> n+1)
				//create 10 myThread
				.map(MyRunnable::new)
				//here set the limit
				.limit(10)
				.collect(Collectors.toList());
		
		ExecutorService service = Executors.newCachedThreadPool();
		
		runnables.forEach(service::execute);
		service.shutdown();// wait for all threads to finish then shutdown
	}
}
