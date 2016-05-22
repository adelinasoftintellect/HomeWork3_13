
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int number;
		int max = 0;
		int min = 0;

		for (int x = 0; x < 5; x++) {
			System.out.print("Please, enter an integer: ");
			number = input.nextInt();
			if (x==0){
				max = number;
				min = number;
			}

			if (number > max) {
				max = number;
			}
			if (number < min) {
				min = number;
			}
		}
		System.out.println("Highest value: " + max);
		System.out.println("Smallest value: " + min);

		input.close();
	}
}
