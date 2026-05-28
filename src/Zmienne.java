public class Zmienne {
    public static void main(String[] args) {
        int liczba;
        liczba = 13;

        double liczba2 = 17.7;

        System.out.println("Moja zmienna: " + liczba + ", " + liczba2);

        int liczba3;
        double liczba4;

        liczba4 = liczba;
        liczba3 = (int)liczba2;

        System.out.println(liczba4 +", wynik: " + liczba3);

        double wynik;
        wynik = liczba3 % (liczba4 * liczba2);

        char znak = '#';

        String napis = "Dzisiaj \tjest \"ładnie\"";
        napis += ".";

        System.out.println("Mój napis: " + napis);
        System.out.print("Mój napis: " + napis + "\n");
        System.out.print("Mój napis: " + napis);

        boolean sun = true; //false



        // https://github.com/przemjan/trzecia_p_2026_java_gr_2.git

    }
}
