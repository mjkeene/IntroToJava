import java.util.Scanner;

public class ComputeArea {
	public static void main(String[] args) {
	// double radius;
	// double area;
	System.out.print("Enter the radius:");
	Scanner input = new Scanner(System.in);
	double radius = input.nextDouble();
	double area = radius * radius * 3.1415926535897932;
	System.out.println("The area for the circle of radius " + radius + " is " + area);
	}
}
