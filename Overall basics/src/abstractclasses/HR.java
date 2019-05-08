package abstractclasses;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class HR {
	public List<Employee> listOfEmployees = new ArrayList<>(); //type is inferred from declaration
	
	public void hire(Employee e) {
		listOfEmployees.add(e);
	}
	
	public void layOff(Employee e) {
		listOfEmployees.remove(e);
	}
	
	public List<Employee> getEmployees(){
		return listOfEmployees;
	}
	
	public void printEverybody() {
		//forEach takes a Consumer, which means it takes a value and returns void
		//System.out::println is a lambda reference to println that takes 1 argument 
		listOfEmployees.forEach(System.out::println);
	}
	
	public void payEverybody() {
		for(Employee e : listOfEmployees) {
			System.out.printf("Paying %s the money : %d", e.getName(),NumberFormat.getCurrencyInstance(Locale.FRANCE).format(e.getPay()));
		}
	}
}
