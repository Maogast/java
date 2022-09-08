package javaProgramTuk;

class Rectangle {
    int length;
    int width;

    void insertRecord(int l, int w) {
        length = l;
        width = w;
    }

    void calculateArea() {
        System.out.println(length * width);
    }

}

class TestRectangle1 {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle();
        Rectangle r3 = new Rectangle();

        r1.insertRecord(5, 4);
        r2.insertRecord(4, 2);
        r3.insertRecord(8, 3);

        r1.calculateArea();
        r2.calculateArea();
        r3.calculateArea();

    }
}
