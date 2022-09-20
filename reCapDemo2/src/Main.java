public class Main {
    //Java Dersi 15
    public static void main(String[] args) {
        double[] list = {3.6, 5.9, 8.7, 1.4, 3.1};
        double total = 0;
        double max = list[0];
        for (double number : list) {
            total = total + number;
            if (max < number) {
                max = number;
            }
            System.out.println(number);
        }
        System.out.println("Toplam : " + total);
        System.out.println("En büyük sayı : " + max);
    }
}
