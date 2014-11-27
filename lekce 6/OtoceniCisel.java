public class OtoceniCisel {
    public static void main(String args[]) {
        int pole[] = new int[100];
        int pocet = 0;
        java.util.Scanner sc = new java.util.Scanner(System.in);
        while (sc.hasNextInt()) {
            pole[pocet] = sc.nextInt();
            pocet++;
            if (pocet == pole.length) {
                break;
            }
        }
        for (int i = pocet - 1; i >= 0; i--) {
            System.out.printf(" %d", pole[i]);
        }
        System.out.println();
    }
}