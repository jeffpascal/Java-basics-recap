package comparatorexample;

public class User {
	public static User DEFAULT_USER = new User(0, "No Name");
	
	private String name;
	private int id;
	
	public User(int id, String name) {
		this.id = id;
		this.name = name;
	}

	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
			
		
	
}
