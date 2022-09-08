package javaProgramTuk;

class Employee {
    int id;
    String name;
    float salary;

    void insertRecord(int i, String n, float s) { // Let's see an example where we are maintaining records of employees.
        id = i;
        name = n;
        salary = s;

    }

    void display() {
        System.out.println(id + " " + name + " " + salary);
    }

}

public class TestEmployee {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee();
        Employee e3 = new Employee();
        e1.insertRecord(101, "Peter", 45000);
        e2.insertRecord(102, "John", 25000);
        e3.insertRecord(103, "James", 55000);
        e1.display();
        e2.display();
        e3.display();
    }

}