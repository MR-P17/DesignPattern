package ProxyDesignLLD;

public class EmployeeDaoImpl implements EmployeeDao{

    @Override
    public void create(String client, Employee emp) throws Exception {
        System.out.println("Creation Successful!!");
    }

    @Override
    public void delete(String client, int employeeId) throws Exception {
        System.out.println("Deletion Successful!!");
    }

    @Override
    public Employee get(String client, int employeeId) throws Exception {
        System.out.println("Get Operater Successful!!");
        return new Employee();
    }
}
