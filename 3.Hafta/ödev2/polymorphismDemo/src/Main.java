public class Main {

    public static void main(String[] args) {
/*      EmailLogger emailLogger =new EmailLogger();
        emailLogger.Log("Log mesajı");

        DatabaseLogger databaseLogger =new DatabaseLogger();
        databaseLogger.Log("Log mesajı");*/

//        BaseLogger[] loggers =new BaseLogger[]{new DatabaseLogger(),new FileLogger(),new EmailLogger(),new ConsoleLogger()};//BaseLogger türünde array oluşturduk.
//        //BaseLogger[] loggers ={new DatabaseLogger(),new FileLogger(),new EmailLogger()};
//        for (BaseLogger logger:loggers){
//            logger.Log(" Log mesajı");
//        }

        CustomerManager customerManager =new CustomerManager(new FileLogger());
        customerManager.add();


    }
}
