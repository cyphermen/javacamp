public class Main {
    //Jav Dersi 14
    public static void main(String[] args) {
        String[] students = new String[3];
        students[0] = "Ahmet";
        students[1] = "Mehmet";
        students[2] = "Veli";
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }
        System.out.println("---------------");
        //**********Dizilerde kolay bir for kullanımı**********
        for (String student : students) { //Öğrenciler dizini boyunca gezecek ve bu değerleri öğrenci isminde bir değişkene atayacak
            System.out.println(student);
        }

    }
}
