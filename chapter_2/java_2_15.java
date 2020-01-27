public class java_2_15 {
  public static void main(String[] args) {
    long totalMilliseconds = System.currentTimeMillis();

    long totalSeconds = totalMilliseconds / 1000;

    long totalMinutes = totalSeconds / 60;

    long currentMinute = totalMinutes % 60;
    
    System.out.println("The current minute is: " + currentMinute); 
   }
}
