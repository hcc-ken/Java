package Company.Persons.Employees;

import Company.Persons.Person;

public class Employee extends Person {
    protected double salary;
    protected int senior_year;

    final double DEFAULT_SALARY = 0;
    final int DEFAULT_SENIOR_YEAR = 0;

    public Employee() {
        super();
        salary = DEFAULT_SALARY;
        senior_year = DEFAULT_SENIOR_YEAR;
    }

    public Employee (String name, int age, int id, double salary, int senior_year) {
        super(name, age, id);
        this.salary = salary;
        this.senior_year = senior_year;
    }

    public double bonusCalculator() {
        return senior_year * 200;
    }
}
