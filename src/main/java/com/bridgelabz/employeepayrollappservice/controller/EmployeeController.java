package com.bridgelabz.employeepayrollappservice.controller;
import com.bridgelabz.employeepayrollappservice.model.Employee;
import java.util.*;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employeepayrollservice")
public class EmployeeController {

    List<Employee> list = new ArrayList<>();

    @GetMapping("/")
    public List<Employee> getAll() {
        return list;
    }

    @PostMapping("/create")
    public Employee create(@RequestBody Employee emp) {
        list.add(emp);
        return emp;
    }
}