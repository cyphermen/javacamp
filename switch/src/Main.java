public class Main {
    //Java Dersi 10
    public static void main(String[] args) { // CTRL + sihft + ALT + L ile kodu düzenleyebilirsin
        char grade = 'C';

        switch (grade) {
            case 'A':
                System.out.println("Mükemmel: Geçtiniz");
                break;
            case 'B':
            case 'C':
            case 'D':
                System.out.println("Geçtiniz");
                break;
            case 'F':
                System.out.println("Maalesef Kaldınız");
                break;
            default:
                System.out.println("Lütfen geçerli bir not giriniz");
        }
    }
}
