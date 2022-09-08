import java.util.Scanner;

public class patient {
    static String[] patients = new String[3];
    static String[] age = new String[3];

    static String[] county = new String[3];
    static Integer i;
    private static String[] patient;

    public static String Registerpatient() {
        Scanner input = new Scanner(System.in);

        for (i = 0; i < 3; i++) {
            System.out.println("Enter Name of patient " + i);
            patients[i] = input.nextLine();
            System.out.println("Enter age of patient " + i);
            age[i] = input.nextLine();

            System.out.println("Enter county of patient " + i);
            county[i] = input.nextLine();

        }

        return null;
    }

    public static String Showuserdetails() {

        System.out.println("Patients admitted ");

        System.out.println("Name \t      age      \t county");
        for (i = 0; i < 3; i++) {
            System.out.println(patients[i] + "\t" + age[i] + "\t" + county[i]);

        }
        return patient[i];
    }
}
