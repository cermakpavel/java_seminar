public class Sude {
    public static void main(String[] args) {
        int cislo = Integer.parseInt(args[0]);
        if ((cislo % 2) == 0) {
            System.out.println("Tohle je sude cislo.");
        } else {
            System.out.println("Tohle neni sude cislo.");
        }
    }
}