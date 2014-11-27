public class KombinacniCislo {
    public static int faktorial(int n) {
        if (n <= 1) {
            return 1;
        }
        int vysledek = 1;
        while (n > 0) {
            vysledek *= n;
            n--;
        }
        return vysledek;
    }
 
    public static int spocti(int n, int k) {
        /* Zvlastni pripady nejdriv. */
        if (k > n) {
            return 0;
        }
        if ((k == 0) || (k == n)) {
            return 1;
        }
 
        /*
         * Upraveny zlomek: z n!/( k!(n-k)! ) je vykraceno k! (predpokladame, ze
         * n >= k) Protoze int ma omezenou velikost, kratime tu co nejdriv.
         */
        int vysledek = 1;
        int jmenovatel_cinitel = 2;
        int jmenovatel_konec = n - k;
        for (int i = k + 1; i <= n; i++) {
            vysledek *= i;
            while ((jmenovatel_cinitel <= jmenovatel_konec)
                    && ((vysledek % jmenovatel_cinitel) == 0)) {
                vysledek /= jmenovatel_cinitel;
                jmenovatel_cinitel++;
            }
        }
 
        return vysledek;
    }
 
    public static void ukaz(int n, int k) {
        int vysledek = spocti(n, k);
        System.out.printf("(%d nad %d) = %d\n", n, k, vysledek);
    }
 
    public static void main(String[] args) {
        ukaz(2, 2);
        ukaz(5, 3);
        ukaz(17, 6);
        ukaz(25, 4);
        ukaz(21, 8);
        ukaz(7, 1);
    }
}