package exceptions;
public class Exceptions {
	public static void main(String[] args) {
		
		
		
		int y = 0;
		int x = 9;
		
		try {
			double result = x/y;

		}
		catch(ArithmeticException e) {
			System.err.println(e.getMessage());
		}
		try {
			throw new MyException();

			
		} catch (MyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
