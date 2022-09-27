public class ProductManager {
    /*  yazılım geliştirme prensiplerinde (SOLID), tek sorumluluk prensibi derki;
        Bir class ,bir metod ,bir if bloğunun sadece tek sorumluluğu olmalı yani sadece bir işi yapmalı.
        Bizim de burada attributes ile operasyonları tek bir class'da tutmak yerine ayırma sebebimiz bu.*/
    public void Add(Product product) {//Product türünde bir parametre verdik
        System.out.println("Ürün eklendi: " + product.name);
    }
}
