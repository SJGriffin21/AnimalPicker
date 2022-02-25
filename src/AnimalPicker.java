import java.util.Scanner;

public class AnimalPicker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner userInput = new Scanner(System.in);
		boolean selected = false;
		
		while (!selected) {
			System.out.println("What animal would you like to see, a dog, cat, or a fish?");
			String response = userInput.nextLine();
		
			if (response.equalsIgnoreCase("cat")) {
				System.out.println(" _._     _,-\'\"\"`-._\n(,-.`._,\'(       |\\`-/|\n    `-.-\' \\ )-`( , o o)\n          `-    \\`_`\"\'-");
				selected = true;
			}
			else if (response.equalsIgnoreCase("dog")) {
				System.out.println("  __      _\no\'\')}____//\n `_/      )\n (_(_/-(_/");
				selected = true;
			}
			else if (response.equalsIgnoreCase("fish")) {
				System.out.println("      /`·.¸\n     /¸...¸`:·\n ¸.·´  ¸   `·.¸.·´)\n: © ):´;      ¸  {\n `·.¸ `·  ¸.·´\\`·¸)\n     `\\\\´´\\¸.·´");
				selected = true;
			}
			else {
				System.out.println("Error: Invaild option");
			}
		}
	}

}
