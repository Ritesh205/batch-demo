package com.batch.batchdemo.processor;

import com.batch.batchdemo.model.Employee;
import lombok.extern.slf4j.Slf4j;
import org.springframework.batch.item.ItemProcessor;

@Slf4j
public class EmployeeItemProcessor implements ItemProcessor<Employee, Employee> {

    @Override
    public Employee process(Employee item) throws Exception {

//        transforming salary
        item.setSalary(item.getSalary() + 5000);
        log.info("Transforming salary of Employee.Transformed salary :{}", item.getSalary());
        return item;
    }
}
