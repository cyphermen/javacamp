public class Main {
    public static void main(String[] args) {

        //Javada proje mainden dallanır.
        sayiBulmaca(); //fonksiyonu çağırdık.
        sayiBulmaca();//fonksiyonu tekrar çağırabiliriz
    }

    //Metot isimleri camelCase ile yazılır
    public static void sayiBulmaca() {
        int[] sayilar = {1, 3, 2, 5, 7, 8, 9, 0};
        int aranacak = 3;
        boolean varMi = false;

        for (int sayi : sayilar) {
            if (sayi == aranacak) {
                varMi = true;
                break;
            }
        }

        if (varMi) {
            mesajVer("Sayı mevcuttur : " + aranacak); //mesaj değişkenine "Sayı mevcuttur : " + aranacak değerini vermiş olduk.
        } else {
            mesajVer("Sayı mevcut değildir : " + aranacak);
        }
    }

    public static void mesajVer(String mesaj){ //mesaj adında bir değişken oluşturduk ve parametre olarak metoda verdik.
        System.out.println(mesaj); //metod, çağırıldığı zaman mesaj değişkenini ekrana yazdıracak.
    }

}







