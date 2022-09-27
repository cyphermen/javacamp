public class Main {

    public static void main(String[] args) {

        Product product = new Product(5, "Laptop", "Asus Laptop", 7000, 9);

        ProductManager productManager = new ProductManager();
        productManager.Add(product);
        System.out.println(product.getKod());

        Product product2 = new Product();
    }
}
