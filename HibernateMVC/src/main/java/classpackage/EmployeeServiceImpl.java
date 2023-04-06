package classpackage;
import java.util.List;

import javax.transaction.TransactionScoped;
import javax.transaction.Transactional;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import classpackage.EmployeeDAO;
import classpackage.Employee;


@Service("employeeService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class EmployeeServiceImpl implements EmployeeService {

 @Autowired
 private EmployeeDAO employeeDAO;

 @Transactional(propagation = Propagation.REQUIRED, readOnly = false)
 public void addEmployee(Employee employee) {
  employeeDAO.addEmployee(employee);
 }

 public List<Employee> listEmployeess() {
  return employeeDAO.listEmployeess();
 }

 public Employee getEmployee(int empid) {
  return employeeDAO.getEmployee(empid);
 }

 public void deleteEmployee(Employee employee) {
  employeeDAO.deleteEmployee(employee);
 }

}