public class Main {
    // Java Dersi 11-12-13
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) { // for(....=sayaç tanımı;.....=çalışma şartı;.....=sayacın sokulacağı işlem)
            System.out.println(i);
        }
        System.out.println("For döngüsü bitti");

        //while
        int i = 2;
        while (i < 10) { //bir değişken default haliyle tanımlandıysa sadece tanımlandığı blokta ({....}) geçerlidir
            System.out.println(i);
            i += 2;
        }
        System.out.println("While döngüsü bitti");

        //Do-While
        int j = 1;
        do { //While ve Do-While arasındaki fark: While önce şartı kontrol eder,şart sağlanırsa kodu çalıştırır.do-while önce kodu çalıştırır ardından şartı kontrol eder yani;şart sağlanmasa bile kod en az bir kere çalışır.Bunun nedeni programın satır-satır çalışması.
            System.out.println(j);
            j += 2;
        } while (j < 10);
        System.out.println("Do-While döngüsü bitti");
    }
}
