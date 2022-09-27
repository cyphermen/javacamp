public class Product {
    private int _id;//private;sadece tanımlandığı blokta ({...}) geçerli olsun demek
    private String _name;
    private String _description;
    private double _price;
    private int _stockAmount;
    private String _renk;
    private String _kod;


    //getter
    public int getId() {
        return _id;
    }

    //setter
    public void setId(int id) {
        // this.id=id       this'in anlamı şu: Bu id, class'ın id'si demek (şu anda baştaki).Parametre olarak atadadığımız id değil.
        //Yukarıdaki gibi bir kullanım yerine (isimlerin aynı olduğu ve this kullandığımız),fiel'ın ismini farklı yapmak daha doğrudur.(field'ı isimlendiriken id yerine _id,name yerine _name demek gibi):
        _id = id;
    }


    public String getName() {
        return _name;
    }

    public void setName(String name) {
        _name = name;
    }

    public String getDescription() {
        return _description;
    }

    public void setDescription(String description) {
        _description = description;
    }

    public double getPrice() {
        return _price;
    }

    public void setPrice(double price) {
        _price = price;
    }

    public int getStockAmount() {
        return _stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        _stockAmount = stockAmount;
    }

    public String getRenk() {
        return _renk;
    }

    public void setRenk(String renk) {
        _renk = renk;
    }


    public String getKod() {
        return _name.substring(0, 1) + _id;
    }
}


