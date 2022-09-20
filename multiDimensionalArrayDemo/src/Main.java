public class Main {
    //Java Dersi 16
    public static void main(String[] args) {
        String[][] harfler = new String[2][3];
        harfler[0][0] = "A";
        harfler[0][1] = "B";
        harfler[0][2] = "C";
        harfler[1][0] = "D";
        harfler[1][1] = "E";
        harfler[1][2] = "F";

        for (int i = 0; i <= 1; i++) {
            System.out.println("--------------");
            for (int j = 0; j <= 2; j++) {
                System.out.println(harfler[i][j]);
            }
        }
    }
}
