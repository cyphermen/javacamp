public class DatabaseLogger extends BaseLogger{
    public void log(String message){//aynı imza ama farklı iş yapıyorlar.overriding
       System.out.println("Logged to database" + message);
    }
}

