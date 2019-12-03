package DataEncapsulation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Company {

    private String name;
    private List<String> employees = new ArrayList<>();

    // POJO Plain Old Java Object
    public Company() {}

    public void printSorted() {
        System.out.println("CompanyName: " + name);
        Collections.sort(employees);
        System.out.println("sorted: " + employees);
    }

    public void setName(String name) {
        if (name == null) {
            System.out.println("name can't be null");
            return;
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addEmployees(String employee) {
        if (employee == null) {
            System.out.println("can't add null employee");
            return;
        }
        employees.add(employee);
    }

}
