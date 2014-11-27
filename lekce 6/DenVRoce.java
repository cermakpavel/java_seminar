public class DenVRoce {
    public static boolean jePrestupny(int rok) {
        boolean delitelny4 = (rok % 4) == 0;
        boolean delitelny100 = (rok % 100) == 0;
        boolean delitelny400 = (rok % 400) == 0;
 
        if (delitelny400) {
            return true;
        } else if (delitelny100) {
            return false;
        } else {
            return delitelny4;
        }
    }
 
    /* mesic je èíslo 1..12 */
    public static int dnuVMesici(int rok, int mesic) {
        int[] dny = new int[] { 31, 0, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        if (mesic == 2) {
            if (jePrestupny(rok)) {
                return 29;
            } else {
                return 28;
            }
        } else {
            return dny[mesic - 1];
        }
    }
 
    public static int soucetDnuZaMesice(int rok, int mesic) {
        int soucetDni = 0;
        while (mesic > 0) {
            soucetDni += dnuVMesici(rok, mesic);
            mesic--;
        }
        return soucetDni;
    }
 
    public static int pocetDnuOdZacatkuRoku(int rok, int mesic, int den) {
        return soucetDnuZaMesice(rok, mesic - 1) + den;
    }
 
    public static void main(String args[]) {
        int rok = Integer.parseInt(args[0]);
        int mesic = Integer.parseInt(args[1]);
        int den = Integer.parseInt(args[2]);
 
        int vysledek = pocetDnuOdZacatkuRoku(rok, mesic, den);
        System.out.printf("%d. %d. %d je %d. den roku.\n", den, mesic, rok,
                vysledek);
    }
}