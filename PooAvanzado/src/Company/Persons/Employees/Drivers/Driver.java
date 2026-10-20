package Company.Persons.Employees.Drivers;

import Company.Persons.Employees.Employee;

import java.util.ArrayList;

public class Driver extends Employee {
    private String drivingLicense;
    private ArrayList <String> license = new ArrayList<>();

    final String DEFAULT_drivingLicense = "";

    public Driver() {
        drivingLicense = DEFAULT_drivingLicense;
    }

    public Driver(String name, int age, int id, double salary, int senior_year, String drivingLicense) {
        super(name, age, id, salary, senior_year);
        this.drivingLicense = drivingLicense;
    }

    public void addLicense () {
        if (license.size() < 3) {
            license.add(drivingLicense);
        } else {
            System.out.println("Cantidad de licencia máxima alcanzada.");
        }
    }
}
