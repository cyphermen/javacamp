public class Main {
    //Java Dersi 17
    public static void main(String[] args) {
        String mesaj = "Bugün hava çok güzel.";
        System.out.println(mesaj);

        System.out.println("Eleman Sayısı :" + mesaj.length()); //.length() fonksiyonu metnin karakter sayısını verir
        System.out.println("8. eleman : " + mesaj.charAt(7)); //.charAt(7) bize 8.karakteri verir
        System.out.println(mesaj.concat(" Yaşasın!"));//.concat() fonksiyonu ile iki metni birleştirdik
        System.out.println(mesaj);
        System.out.println(mesaj.startsWith("B"));//.startsWith() fonksiyonu boolean bir değer döndürür. ... ile mi başlıyor sorusuna cavap döner.startsWith("B") dediğmizde true döner çünkü metin B ile başlıyor
        System.out.println(mesaj.endsWith("A"));//bu da ... ile mi bitiyor sorusuna cevap döner
        char[] karakterler = new char[5];
        mesaj.getChars(0, 5, karakterler, 0);//.getChars() bize srcBegin'dan srcEnd'e kadar olan karakterleri alacak ve yeni bir char değişkenine, dstBegin'den index'ten itabaren atayacak
        System.out.println(karakterler);
        System.out.println(mesaj.indexOf('a'));//.indexOf() Belirttiğimiz karakterin ya da karakterlerin (kelime de yazabilirz yani) mesajın içinde baştan kaçıncı index olduğunu verecek (Aramaya baştan başlar)
        System.out.println(mesaj.lastIndexOf("a"));//.lastIndexOf() belirttiğimiz karakterin ya da karakterlerin (kelime de yazabilirz yani) mesajın içinde baştan kaçıncı index olduğunu verecek (Aramaya sondan başlar)

        System.out.println(mesaj.replace(" ","-"));//.replace metodu mesaj'ı alır. target'ı replacement ile değiştirir.Burada boşluğu çizgi ile değiştirecek.
        System.out.println(mesaj);//String fonksiyonlarının büyük çoğunluğu ilgili metni değiştirmez yeni bir çıktı üretir.Eğer istersek bu yeni çıktıyı bir değişkene atarak kullanabiliriz.
        String yenimesaj = mesaj.replace(" ","-"); //Çıktıyı sonradan kullanabilmek için bir değişkene atıyoruz.
        System.out.println(yenimesaj);
        System.out.println(mesaj.substring(2));//2.indexten sonuncu indexe kadar mesajı böler.
        System.out.println(mesaj.substring(2,4));//2.indexten 4.indexe kadar mesajı böler (4'ü dahil etmez).

        for (String kelime: mesaj.split(" ")){ //.split() metodu ile parantezde yazan değere göre mesajı böldük ve böldükten sonra oluşan elemanları kelime adında yeni bir dizine atadık.
            System.out.println(kelime);
        }
        System.out.println(mesaj.toLowerCase());//.toLowerCase() ,mesajın içerisindeki bütün harfleri küçültür.
        System.out.println(mesaj.toUpperCase());//toUpperCase(),mesajın içerisindeki bütün harfleri büyük harf yapar.
        String yenimesaj2="    trim fonksiyonu kullanımı   ";
        System.out.println(yenimesaj2.trim());//mesajın başındaki ve sonundaki boşlıkları ortadan kaldırır.

    }
}
