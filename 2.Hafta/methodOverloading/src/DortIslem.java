public class DortIslem {

    public int topla(int sayi1,int sayi2){
        return sayi1+sayi2;
    }

    public int topla(int sayi1,int sayi2,int sayi3){ //Bu şekilde aynı isme sahip 2 tane toplam metodu oluşturabiliriz (overloading).Çünkü ikisinin metod imzaları farklı.
        return sayi1+sayi2+sayi3;
    }
    public int topla(int sayi1,int sayi2,int sayi3,int sayi4){
        return sayi1+sayi2+sayi3+sayi4;
    }

}