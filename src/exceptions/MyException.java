package exceptions;

public class MyException extends Exception{
	public MyException(String message){
		super(message);
	}
	
	public MyException() {
		this("Default Message");
	}
}
