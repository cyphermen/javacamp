public class Main {
//********Java Dersi 23.Aranan Sayının mevcut olup olmadığını yazma.***********
    public static void main(String[] args) {
	    int[] sayilar={1,3,2,5,7,8,9,0};
        int aranacak=3;
        boolean varMi=false;//boolean ile işlem yapmak bize if-else kodlarını döngünün dışında çalıştırma imkanı sağlar.

        for (int sayi:sayilar) {
            if(sayi==aranacak){
                varMi=true;
                break;
            }
        }

        if (varMi){
            System.out.println("Aranan sayı mevcut.");
        }else {
            System.out.println("Aranan sayı mevcut değil.");
        }
    }
}
