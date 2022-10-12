public class Main {

    public static void main(String[] args) {
        CustomerManager customerManager = new CustomerManager();

        customerManager.databaseManager = new OracleDatabaseManager();
        customerManager.getCustomer();
        customerManager.databaseManager = new SqlServerDatabaseManager();
        customerManager.getCustomer();
        customerManager.databaseManager = new MySqlDatabaseManager();
        customerManager.getCustomer();
    }
}
