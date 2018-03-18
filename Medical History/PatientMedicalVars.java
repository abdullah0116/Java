import java.util.Scanner;

public class PatientMedicalVars {

    Scanner sc = new Scanner(System.in);

    private String patientFirstName;
    private String patientLastName;
    private int age = 0;
    private double hight = 0.0;
    private double weight = 0.0;

    public String setFirstName(String firstName) {
        sc.nextLine();
        firstName = patientFirstName;
    }
}
