package classpackage;
import java.util.List;
import classpackage.Employee;
public interface EmployeeDAO {

 public void addEmployee(Employee employee);

 public List<Employee> listEmployeess();

 public Employee getEmployee(int empid);

 public void deleteEmployee(Employee employee);
}