package com.m1ddler.spring.rest;

import com.m1ddler.spring.rest.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Component
public class Communication {
    private final RestTemplate restTemplate;
    private final String url = "http://localhost:8080/spring_course_rest/api/employees";

    @Autowired
    public Communication(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public List<Employee> showAllEmployees() {
        ResponseEntity<List<Employee>> responseEntity =
                restTemplate.exchange(url, HttpMethod.GET, null,
                        new ParameterizedTypeReference<List<Employee>>() {});
        return responseEntity.getBody();
    }

    public Employee getEmployeeById(int id) {
        ResponseEntity<Employee> responseEntity = restTemplate.exchange(url + "/" + id, HttpMethod.GET, null,
                new ParameterizedTypeReference<Employee>() {});
        return responseEntity.getBody();
    }

    public void addEmployee(Employee employee) {
        int id = employee.getEmpId();
        if (id == 0) {
            ResponseEntity<String> responseEntity =
                    restTemplate.postForEntity(url, employee, String.class);
            System.out.println("Employee added to Data Base:");
            System.out.println(responseEntity.getBody());
        }
        else{
            restTemplate.put(url, employee);
            System.out.println("Employee with id " + id + " was updated");
        }
    }

    public void deleteEmployee(int empId) {
        ResponseEntity<String> responseEntity = restTemplate.exchange(url + "/" + empId, HttpMethod.DELETE, null, String.class);
        System.out.println("Employee with id " + empId + " was deleted");
    }
}
