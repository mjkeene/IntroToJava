import java.util.Scanner;

public class CelciusToFahrenheit {
  public static void main(String[] args) {
    // read a celcius degree and convert to fahrenheit
    System.out.print("Enter a degree in C to be converted to F: ");
    Scanner input = new Scanner(System.in);
    double celcius = input.nextDouble();
    double fahrenheit = (celcius * (9.0 / 5)) + 32;
    System.out.println(celcius + " C is " + fahrenheit + " F");
    }
}
