package abstractclasses;

public class Salaried extends Employee{

	public static final double DEFAULT_SALARY = 120000;
	
	private double salary = DEFAULT_SALARY;
	
	public Salaried() {
		
	}
	
	public Salaried(String name) {
		this(name, DEFAULT_SALARY);
	}
	
	public Salaried(String name, double salary) {
		super(name);
		this.salary = salary;
	}
	
	
	public double getSalary() {
		return salary;
		
	}
	
	@Override
	public double getPay() {
		return salary/12;
		
	}

	
}
