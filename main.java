class Person {
    String name = "Nandini";

    void displayPerson() {
        System.out.println("Name: " + name);
    }
}

class Employee extends Person {
    int employeeid = 101;

    void displayEmployee() {
        System.out.println("Employee ID: " + employeeid);
    }
}

class Manager extends Employee {
    String department = "CSE";

    void displayManager() {
        System.out.println("Department: " + department);
    }
}

public class main {
    public static void main(String[] args) {
        Manager m = new Manager();
        m.displayPerson();
        m.displayEmployee();
        m.displayManager();
    }
}