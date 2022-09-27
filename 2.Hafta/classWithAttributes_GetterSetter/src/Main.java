public class Main {

    public static void main(String[] args) {
        Product product = new Product();
        product.setId(1);
        product.setName("Laptop");
        product.setDescription("Asus Bilgisayar");
        product.setPrice(15000);
        product.setStockAmount(9);

        ProductManager productManager=new ProductManager();
        productManager.Add(product);

        System.out.println(product.getKod());
    }
}
