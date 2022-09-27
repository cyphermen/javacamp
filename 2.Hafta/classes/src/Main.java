public class Main {
    public static void main(String[] args) {
        //class'lar reference type'dır.
        CustomerManager customerManager1 = new CustomerManager();//şuanda CustomerManager türünde bir nesne oluşturduk. Bu nesne bellekte bir referans numarasıyla duruyor.Diyelimki 10001
        CustomerManager customerManager2 = new CustomerManager();//şuanda bellekte CustomerManager türünde ikinci bir nesne oluşturduk.Referans numarası diyelimki 10002
        customerManager1=customerManager2; //customerManager1'in referans numarasını customerManager2'ye eşitledik.Artık customerManager1'in referans numarası da 10002 oldu.
        //Peki 10001'e ne olacak.Herhangi bir referansı tutan kimse kalmazsa, Garbage Collector (Javanın bellek yöneticisi) onu bellekten siler.
        //new'i gerektiği yerde kullanmak,bellekte boşa alan kaplamamak gerekir.
        customerManager1.Add();
        customerManager1.Remove();
        customerManager1.Update();

        //value type
        int sayi1=10;
        int sayi2=20;
        sayi2=sayi1;
        sayi1=30;
        System.out.println(sayi2); //Çıktı ne olur??
        //Value type'lar stack'de oluşur

        //array'ler de reference type'dır.
        int[] sayilar1={1,2,3}; //Bununla    int[] sayilar1= new int[] {1,2,3}  aynı şey
        int[] sayilar2={4,5,6};
        sayilar2=sayilar1;
        sayilar1[0]=10;
        System.out.println(sayilar2[0]);//Çıktı ne olur?
        //reference type'lar heap'de oluşturulan alana referans gösterir.reference type ile işlem yapacağımız zaman referans gösterdiği alana gideriz.
    }
}
