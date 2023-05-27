package ProxyDesignLLD;

public class ProxyDesignPattern {
    public static void main(String[] args) {
        try{
            EmployeeDao employeeDao = new EmployeeDaoProxy();
            employeeDao.create("ADMIN", new Employee());
            System.out.println("Operater Successful");
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
