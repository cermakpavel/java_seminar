public class Odmocnina {
    public static double odmocnina(double cislo, double presnost) {
        double odhad = 1.;
        double prechoziOdhad = odhad + 10 * presnost;
 
        while (Math.abs(odhad - prechoziOdhad) > presnost) {
            prechoziOdhad = odhad;
            odhad = (prechoziOdhad + cislo / prechoziOdhad) / 2;
        }
 
        return odhad;
    }
 
    public static void ukaz(double cislo, double presnost) {
        double moje = odmocnina(cislo, presnost);
        double skutecna = Math.sqrt(cislo);
 
        System.out.printf("odmocnina(%10.5f, %9.7f) = %20.15f  [%10.15f]\n",
                cislo, presnost, moje, skutecna);
    }
 
    public static void main(String[] args) {
        /*
         * Predpokladam, ze nacist cislo zvladnete. Takze jenom ukazka, jak
         * presne to pocita.
         */
 
        System.out.printf("====== Odmocnina z 1000 ======\n");
        ukaz(1000, 2);
        ukaz(1000, 1);
        ukaz(1000, 0.8);
        ukaz(1000, 0.5);
        ukaz(1000, 0.1);
        ukaz(1000, 0.01);
        ukaz(1000, 0.001);
        ukaz(1000, 0.0001);
        ukaz(1000, 0.00001);
        ukaz(1000, 0.000001);
 
        System.out.printf("====== Odmocnina z 0.5 =======\n");
        ukaz(0.5, 2);
        ukaz(0.5, 1);
        ukaz(0.5, 0.8);
        ukaz(0.5, 0.5);
        ukaz(0.5, 0.1);
        ukaz(0.5, 0.01);
        ukaz(0.5, 0.001);
        ukaz(0.5, 0.0001);
        ukaz(0.5, 0.00001);
        ukaz(0.5, 0.000001);
    }
}