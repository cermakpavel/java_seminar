public class maximum {
    public static void main(String[] args) {
        /* Vypíše maximální číslo zadané klávesnicí */
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int max = 0; 
        while (sc.hasNextInt()) {
            int cislo = sc.nextInt();
            if (max < cislo) {
              max = cislo;              
            }
        }
        System.out.printf("Největší ze zadaných čísel je %d.\n", max);
    }
}