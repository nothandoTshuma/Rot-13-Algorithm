import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner input =  new Scanner(System.in);
		
		System.out.println("Enter your string, please: ");
		String userString = input.nextLine();

		System.out.println("Please enter the rotation number you would like to use: ");
		int rotation = input.nextInt();
		
		Rot13 userInput = new Rot13(userString, rotation);
		userInput.finalUserText(userString);	
		
		input.close();
	}
}
