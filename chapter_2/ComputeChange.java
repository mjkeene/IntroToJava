import java.util.Scanner;

// Return max dollars, quarters, dimes, nickels, pennies for a given amount
// There is a loss of precision casting double to int
// input 10.03 has incorrect result
public class ComputeChange {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter amount of money in decimal form: ");
	
	double amount = input.nextDouble();
	
	int remainingAmount = (int)(amount * 100);
	
	int numberOfDollars = remainingAmount / 100;
	remainingAmount %= 100;

	int numberOfQuarters = remainingAmount / 25;
	remainingAmount %= 25;
	
	int numberOfDimes = remainingAmount / 10;
	remainingAmount %= 10;

	int numberOfNickels = remainingAmount / 5;
	remainingAmount %= 5;

	int numberOfPennies = remainingAmount;

	System.out.println("This amount is equal to \n" + 
	"\t" + numberOfDollars + " dollars\n" +
	"\t" + numberOfQuarters + " quarters\n" +
	"\t" + numberOfDimes + " dimes\n" +
	"\t" + numberOfNickels + " nickels\n" +
	"\t" + numberOfPennies + " pennies\n");
	}
}
