package scanner;

import java.util.Scanner;

public class Basic {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("int");
		int i = scanner.nextInt();
		System.out.println("stirng");
		String j = scanner.next();
		System.out.printf("%d%n%s", i, j);
		scanner.close();
	}
}
