package entities;

public class Courses {
    private int _id; //id'e gerek var mı?
    private String _name;
    private double _price;
    private String _description;
    private String _instructor; //buna gerek var mı?

    public Courses(int id,String name,double price,String description,String instructor){ //wtf bu neden burada???
        _id =id ;
        _name = name;
        _description = description;
        _price = price;
        _instructor = instructor;
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

    public double getPrice() {
        return _price;
    }

    public void setPrice(double price) {
        _price = price;
    }

    public String getDescription() {
        return _description;
    }

    public void setDescription(String description) {
        _description = description;
    }

    public String getInstructor() {
        return _instructor;
    }

    public void setInstructor(String instructor) {
        _instructor = instructor;
    }
}
