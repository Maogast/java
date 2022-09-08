import java.util.Scanner;

public class His {
    String patientName;
    String patientAge;
    String patientCounty;

    public static void main(String[] args) {
        String username = "";
        String password = "";

        if (login(username, password)) {
            patient.Registerpatient();
        }
        patient.Showuserdetails();

    }

    static boolean login(String username, String password) {

        String rootpassword = "900";
        Scanner input = new Scanner(System.in);
        System.out.println("input username: ");
        username = input.nextLine();
        System.out.println("input password: ");
        password = input.nextLine();

        if (password.equals(rootpassword)) {
            System.out.println("User login successful");
            patient.Registerpatient();
        }
        return false;
    }

}
