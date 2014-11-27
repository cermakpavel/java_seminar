public class cyklus {
  public static void main(String[] args) {
    for ( int i = 0; i < 10; i++) {
      for (int a = 0; a < i; a++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}