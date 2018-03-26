import java.util.Scanner;

public class HospitalStay {

  public static void hosptialStayAPP() {
  Scanner sc = new Scanner(System.in);

  double days, nightlyRate, nightlyMedicationChar, nightlyLabSerChar, oneDayMeds,
        oneDayLabSerChar;

  System.out.print("How much days has the patient spent in the hospital: ");
  days = sc.nextDouble();

  if(days <= 1) {
    System.out.print("How much was the Medication: ");
    oneDayMeds = sc.nextDouble();
    System.out.print("How much was the Lab service Fees: ");
    oneDayLabSerChar = sc.nextDouble();
    double oneDayTotal = oneDayMeds + oneDayLabSerChar;
    System.out.println("This is your total for todays vist: " + oneDayTotal);
    } else if (days > 1) {
      System.out.print("What is the nightly rate of the hosptial: ");
        nightlyRate = sc.nextDouble();
        System.out.print("How much was the Medication: ");
        nightlyMedicationChar = sc.nextDouble();
        System.out.print("How much was the Lab service Fees: ");
        nightlyLabSerChar = sc.nextDouble();
        double multiDayTotal = nightlyLabSerChar + nightlyMedicationChar + nightlyRate;
        System.out.println("This is your total for todays vist: " + multiDayTotal);
      }
    }
  }
