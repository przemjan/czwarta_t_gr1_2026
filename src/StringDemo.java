public class StringDemo {
    public static void main(String[] args) {
        //komentarz
        String name = "Bruno";

        int dlugosc = name.length();

        char inicjal = name.charAt(2);

        String male, duze;
        male = name.toLowerCase();
        duze = name.toUpperCase();

        System.out.println("Długość: " + dlugosc + " ini: " + inicjal);
        System.out.println(duze);

    }
}
