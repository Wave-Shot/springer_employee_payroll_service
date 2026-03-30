package com.bridgelabz.employeepayrollappservice.service;
import com.bridgelabz.employeepayrollappservice.model.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {

    private List<Employee> list = new ArrayList<>();

    public List<Employee> getAll() {
        return list;
    }

    public Employee create(Employee emp) {
        list.add(emp);
        return emp;
    }
}