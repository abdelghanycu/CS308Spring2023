package com.sci;

import com.sci.dao.DBEmployee;
import com.sci.models.Employee;
import java.util.Date;
import java.util.List;

public class Test {

  public static void main(String[] args) {

    DBEmployee db = new DBEmployee();
//    List<Employee> list = db.get();
//    for(Employee employee : list) {
//      System.out.println(employee);
//    }

    Employee employee = new Employee();
    employee.setFirstName("ahmed");
    employee.setLastName("ahmed");
    employee.setEmail("ahmed@gmail.com");
    employee.setJobId("SH_CLERK");
    employee.setSalary(145214);
    employee.setDepartmentId(50);
    employee.setHireDate(new Date());

    System.out.println(db.insert(employee));
  }
}
