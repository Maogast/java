package javaProgramTuk;

//Java Program to demonstrate having the main method in   
//another class  
//Creating Student class.  
class Student {
    int id;
    String name;
}

// Creating another class TestStudent1 which contains the main method
class TestStudent1 {
    public static void main(String args[]) {
        Student s1 = new Student();
        s1.id = 101;
        s1.name = "James";
        Student s2 = new Student();
        s2.id = 102;
        s2.name = "Peter";
        System.out.println(s1.id + " " + s1.name);
        System.out.println(s2.id + s2.name);
    }
}