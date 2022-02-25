import java.util.Scanner;

public class AnimalPicker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("What animal would you like to see, a dog or a cat?");
		String response = userInput.nextLine();
		
		if (response.equalsIgnoreCase("cat")) {
			System.out.println("Cat art here");
		}
		else if (response.equalsIgnoreCase("dog")) {
			System.out.println("Dog art here");
		}
		else {
			System.out.println("Error: Invaild option");
		}
		
	}

}
