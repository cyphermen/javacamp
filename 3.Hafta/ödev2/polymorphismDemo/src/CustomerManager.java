public class CustomerManager {

    private BaseLogger blogger;
    public CustomerManager(BaseLogger logger){
        blogger=logger;
    }

    public void add(){
        System.out.println("Müşteri eklendi");
        this.blogger.log("Log messajı");
    }
}
