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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(salary);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Salaried))
			return false;
		Salaried other = (Salaried) obj;
		if (Double.doubleToLongBits(salary) != Double.doubleToLongBits(other.salary))
			return false;
		return true;
	}

	
}
