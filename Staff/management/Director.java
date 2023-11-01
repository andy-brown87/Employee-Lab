package Staff.management;

import Staff.Employee;

public class Director extends Employee {


    private Integer budget;

    public Director(String name, String niNumber, double salary, int budget) {
        super(name, niNumber, salary);
        this.budget = budget;
    }

    public Integer getBudget() {
        return budget;
    }
}
