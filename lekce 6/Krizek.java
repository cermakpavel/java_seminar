public class Krizek {
    public static void opakujZnak(char znak, int kolikrat) {
        while (kolikrat > 0) {
            System.out.printf("%c", znak);
            kolikrat--;
        }
    }
 
    public static void tiskniNozicky(int sirkaRamena, int sirkaNozicky, int vyska) {
        for (int radek = 0; radek < vyska; radek++) {
            opakujZnak(' ', sirkaRamena);
            opakujZnak('X', sirkaNozicky);
            System.out.println();
        }
    }
 
    public static void tiskniRamena(int sirkaRamena, int sirkaNozicky, int vyska) {
        for (int rameno = 0; rameno < vyska; rameno++) {
            opakujZnak('X', 2 * sirkaRamena + sirkaNozicky);
            System.out.println();
        }
    }
 
    public static void main(String args[]) {
        int rozmer = Integer.parseInt(args[0]);
 
        /* Drobne vylepseni pomeru. */
        int sirkaRamena = rozmer * 5 / 3;
        int vyskaRamena = rozmer * 2 / 3;
 
        tiskniNozicky(sirkaRamena, rozmer, rozmer);
        tiskniRamena(sirkaRamena, rozmer, vyskaRamena);
        tiskniNozicky(sirkaRamena, rozmer, rozmer);
    }
}