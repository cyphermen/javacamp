public class Main {

    public static void main(String[] args) {
        String mesaj = sehirVer();//mesaj değişkenine sehirVer fonksiyonundan gelen String'i vermiş olduk.
        System.out.println(mesaj);
        int sayi = topla(5, 6);//topla fonksiyonu iki int değeri işleme soktu,ardından sayi değişkenine sonucu atadı.
        System.out.println(sayi);
        int sonuc=topla2(1,2,3);
        System.out.println(sonuc);
    }

    public static String sehirVer() {//String türünde bir değer döndürecek
        return "Ankara";
    }

    public static void ekle() { //void, değer döndürmeden yapılacak fonksiyonel işlemlerde kullanılır.Sonuç başka bir yere gönderilmez.
        System.out.println("Eklendi");
    }

    public static int topla(int sayi1, int sayi2) {//Buradaki int,bu fonksiyon int türünde bir değer döndürür demek.int sayi1,int sayi2 parametreleri nedeniyle fonksiyonu kullanmak istediğimizde bizden iki int değer isteyecek.
        return sayi1 + sayi2;
    }

    //Variable Arguments:
    public  static int topla2(int... sayilar){//int... istediğimiz kadar int değer gönderebileceğimiz anlamına gelir.Bunu arka tarafta bir array kurarak yapar.

        int toplam=0;
        for(int sayi:sayilar){
            toplam+=sayi;//toplam=toplam+sayi ile aynı
        }
        return toplam;
    }
    //Variable Arguments kullanmak yerine koleksiyonları ve nesnel yapıları kullanmak daha doğrudur.
}

