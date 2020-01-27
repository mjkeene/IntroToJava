// Shows different behavior of int and double
public class java_2_4 {
  public static void main(String[] args) {
    int a = 1;
    double d = 1.0;
    System.out.println(a = 46 / 9);
    System.out.println(d = 46 / 9);
    System.out.println(a = 46 % 9 + 4 * 4 - 2);
    System.out.println(d = 46 % 9 + 4 * 4 - 2);
    System.out.println(a += 1.5 * 3 + (++a));
    System.out.println(d += 1.5 * 3 + (++d));
    System.out.println(a -= 1.5 * 3 + a++);
    System.out.println(d -= 1.5 * 3 + d++);
    }
}
