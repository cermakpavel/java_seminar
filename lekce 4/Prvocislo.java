public class Prvocislo {
    /*
     * Poznámka k øešení: lepší øešení by bylo samostatnou funkcí, popø.
     * vložit do cyklu alespoò break. Ale i takhle to bude fungovat.
     */
    public static void main(String[] args) {
        int cislo = Integer.parseInt(args[0]);
        boolean jePrvocislo = true;
        if (cislo <= 1) {
            jePrvocislo = false;
        } else {
            int delitel = 2;
            while (delitel * delitel <= cislo) {
                if ((cislo % delitel) == 0) {
                    jePrvocislo = false;
                }
                delitel++;
            }
        }
         
        if (jePrvocislo) {
            System.out.printf("%d je prvocislo.\n", cislo);
        } else {
            System.out.printf("%d neni prvocislo.\n", cislo);
        }
    }
}