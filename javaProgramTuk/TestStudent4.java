package javaProgramTuk;

class Student {
    int rollno;
    String name;

    void insertRecord(int r, String n) { // In this example, we are creating the two objects of Student class and
                                         // initializing the value to these objects by invoking the insertRecord method.
                                         // Here, we are displaying the state (data) of the objects by invoking the
                                         // displayInformation() method.
        rollno = r;
        name = n;
    }

    void displayInformation() {
        System.out.println(rollno + " " + name);
    }
}

class TestStudent4 {
    public static void main(String args[]) {
        Student s1 = new Student();
        Student s2 = new Student();
        s1.insertRecord(111, "Paul");
        s2.insertRecord(222, "Joseph");
        s1.displayInformation();
        s2.displayInformation();
    }
}