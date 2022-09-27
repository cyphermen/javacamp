public class Main {

    public static void main(String[] args) {
        Customer customer=new Customer();
        customer.age=20;
        customer.email="@gmail.com";
        Employee employee =new Employee();
        employee.age=21;
        employee.salary=15000;


        EmployeeManager employeeManager=new EmployeeManager();
        employeeManager.Add();
        employeeManager.BestEmployee();
        CustomerManager customerManager=new CustomerManager();
        customerManager.Add();

    }
}
