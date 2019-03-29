package abstractclasses;

import java.time.LocalDate;

public abstract class Employee {
	private static int nextId = 0;
	private String name;
	private int id;
	private LocalDate hireDate;
	
	public Employee() {
		this("UNKNOWN");
	}
	
	public Employee(String name) {
		this.id = nextId++;
		this.name = name;
		hireDate = LocalDate.now();
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

	private void setId(int id) {
		this.id = id;
	}

	public abstract double getPay();
}
