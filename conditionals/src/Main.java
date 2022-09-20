public class Main {
    // Java Dersi 8
    public static void main(String[] args) {
        int number = 99;
        if (number < 50) {
            System.out.println("Sayı 50'den küçüktür");
        }
        else if (number ==50){ // tek eşit (=) sayıya değer atamak demek.Fakat burada == operatörünü kullanmamız gerekiyor.
            System.out.println("Sayı 50'ye eşittir");
        }
        else {
            System.out.println("Sayı 50'den büyüktür");
        }
    }
}
