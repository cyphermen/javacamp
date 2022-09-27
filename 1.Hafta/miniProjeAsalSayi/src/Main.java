public class Main {
    //Java Dersi 19,verilen sayının asal sayı olup olmadığını bulma
    public static void main(String[] args) {

        int number = 39;
        boolean isPrime = true;

        if (number < 0) {
            System.out.println("Sayı asal değildir");
        } else if (number == 0 || number == 1) {
            System.out.println("Sayı asal değildir");
        } else {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) { //  % mod alma işlemi
                    isPrime = false;
                }
            }
            if (isPrime) { //Eğer şart true ise if çalışacak. Hala true ise tam bölen bir değer çıkmamıştır dolayısıyla asaldır.
                System.out.println("Sayı asaldır");
            } else { //şart false ise else çalışacak. False'a dönmüşse tam bölen bir sayı çıkmıştır dolayısıyla asal değildir.
                System.out.println("Sayı asal değildir");
            }
        }


    }
}

