public class obdelnik {
  public static void main(String[] args) {
    int sirka = Integer.parseInt(args[0]);
    int vyska = Integer.parseInt(args[1]);
    for (int i = 1; i <= 2; i++) {
      for (int a = 1; a <= sirka + 4; a++) {
        System.out.printf("*");
      }
      System.out.printf("\n");
    }
    for (int b = 1; b <= vyska; b++) {
      for (int c = 1; c <= 2; c++) {
        System.out.printf("*");
      }
      for (int d = 1; d <= sirka; d++) {
        System.out.printf(" ");
      }
      for (int e = 1; e <= 2; e++) {
        System.out.printf("*");
      }
      System.out.printf("\n");
    }
    for (int f = 1; f <= 2; f++) {
      for (int g = 1; g <= sirka + 4; g++) {
        System.out.printf("*");
      }
    System.out.printf("\n");
    }
  }
}