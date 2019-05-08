package comparatorexample;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Compare {
	
	public static void main(String[] args) {
		List<User> userList = Arrays.asList(
				new User(1, "aba"),
				new User(2, "aba"),
				new User(3, "aba"),
				new User(4, "aba"));
		
		//implement a comparator because max requires one
		User max = userList.stream().max(new Comparator<User>() {
			@Override
			public int compare(User user1, User user2) {
				return user1.getId() - user2.getId();
			}
		}).orElse(User.DEFAULT_USER); //otherwise i need an optional
		
		//because this is a 
		User max1 = userList.stream().max(new Comparator<Object>() {
			@Override
			public int compare(Object user1, Object user2) {
				return user1.toString().compareTo(user2.toString());
			}
		}).orElse(User.DEFAULT_USER); //otherwise i need an optional
		
		
		Optional<User> max3 = userList.stream().max( (User e1, User e2) -> e1.getId()-e2.getId() );
		
		Optional<User> max4 = userList.stream().max( (Object user1, Object user2) -> user1.toString().compareTo(user2.toString()));
		
		System.out.println(max);
		System.out.println(max1);
		System.out.println(max3);
		System.out.println(max4);
	}
}
