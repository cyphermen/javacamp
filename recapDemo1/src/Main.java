public class Main {
//Java Dersi 9.En büyük sayıyı bulma
    public static void main(String[] args) {
        int sayi1 = 3;
        int sayi2 = 1;
        int sayi3 = 2;

        //Benim çözümüm
        if (sayi1 > sayi2 && sayi1 > sayi3) {
            System.out.println(sayi1 + " en büyüktür");
        } else if (sayi2 > sayi1 && sayi2 > sayi3) {
            System.out.println(sayi2 + " en büyüktür");
        } else {
            System.out.println(sayi3 + " en büyüktür");
        }
        // Hocanın çözümü
        int enBuyuk = sayi1;
        if (enBuyuk < sayi2) {
            enBuyuk = sayi2;
        }
        if (enBuyuk < sayi3) {
            enBuyuk = sayi3;
        }
        System.out.println(enBuyuk + " en büyüktür");

        //Eğer bakılması gereken çok fazla sayı olursa benim yaptığım yöntem çok uğraştırır.Hocanın yağtığı gibi en büyük değer belirleyip diğerleriyle karşılaştırarak en büyük değeri sürekli güncellemek gerekir.
        int[] sayilar = {1,2,3,5,9,8,7,11,2,64,89,99,36,18};
        int enBuyuk2=sayilar[0];
        for(int i:sayilar){
            if(enBuyuk2<i){
                enBuyuk2=i;
            }
        }
        System.out.println("En büyük sayı: " + enBuyuk2);
    }
}
