public class Main {
    public static void main(String[] args) {
        DortIslem dortIslem=new DortIslem();
        System.out.println(dortIslem.topla(2,5));

        System.out.println(dortIslem.topla(1,2,3));//overloading yaptığımız için aynı isme sahip birden fazla metod var.Hangisine uygun parametre verirsek o kullanılacak.

        System.out.println(dortIslem.topla(1,2,3,4));
    }
}
