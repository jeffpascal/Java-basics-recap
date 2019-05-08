package threads;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UseMyThreaD {
	public static void main(String[] args) {
		List<MyThread> threads = 
				//rule for creating creates ints from 0 to infinity incrementing by 2 unless limit is specified
				Stream.iterate(0, n -> n+2)
				//create 10 myThread
				//transform the stream into Mythread instances
				.map(MyThread::new)
				//here set the limit
				.limit(10)
				.collect(Collectors.toList());
		
		threads.forEach(MyThread::start);
	}
}
