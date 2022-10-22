package entities;

public class Category {

    private int _id; //id'e gerek var mı?
    private String _name;

    //NUrgül buraya constructor koymamış ona sor gerek var mı? Bu constructor üstelik parametreli
    public Category(int id, String name) {
        _id = id;
        _name = name;
    }

    public int getId() {
        return _id;
    }

    public void setId(int id) {
        _id = id;
    }

    public String getName() {
        return _name;
    }

    public void setName(String name) {
        _name = name;
    }
}
