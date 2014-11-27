public class Mocniny {
    public static void main(String[] args) {
        /* Vypíše všechny druhé mocniny celých čísel menších než toho číslo */
        int cislo = Integer.parseInt(args[0]);
        int mocniny = 0; 
        for (int i = 1; i < cislo; i++) {
          if ((i * i) < cislo) {
            System.out.println(i * i);
          }
        }
    }
}