public class pokus {
  public static void main(String[] args) {
    System.out.printf("");
    System.out.printf("3 + 4 = %d\n", 3 + 4);
    System.out.printf("3 + 4 * 2 = %d\n", 3 + 4 * 2);
    System.out.printf("(3 + 4) / 2 * 2 = %d\n", (3 + 4) / 2 * 2);
    int a = Integer.valueOf(args[0]); 
    int b = Integer.valueOf(args[1]);
    System.out.printf("%d\n", a + b);
    System.out.printf("%d\n", a / b);
  }
}