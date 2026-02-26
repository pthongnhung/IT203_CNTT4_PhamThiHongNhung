package session13.lesson5;

import java.util.*;

public class Main {

    static ArrayList<Patient> patientList = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void addPatient() {
        System.out.print("Enter ID: ");
        String id = sc.nextLine();

        for (Patient p : patientList) {
            if (p.getId().equals(id)) {
                System.out.println("ID already exists!");
                return;
            }
        }

        System.out.print("Enter full name: ");
        String name = sc.nextLine();

        System.out.print("Enter age: ");
        int age = Integer.parseInt(sc.nextLine());

        System.out.print("Enter diagnosis: ");
        String diagnosis = sc.nextLine();

        patientList.add(new Patient(id, name, age, diagnosis));
        System.out.println("Patient added successfully.");
    }

    public static void updateDiagnosis() {
        System.out.print("Enter ID to update: ");
        String id = sc.nextLine();

        for (Patient p : patientList) {
            if (p.getId().equals(id)) {
                System.out.print("Enter new diagnosis: ");
                p.setDiagnosis(sc.nextLine());
                System.out.println("Diagnosis updated.");
                return;
            }
        }

        System.out.println("Patient not found.");
    }

    public static void dischargePatient() {
        System.out.print("Enter ID to discharge: ");
        String id = sc.nextLine();

        Iterator<Patient> iterator = patientList.iterator();

        while (iterator.hasNext()) {
            if (iterator.next().getId().equals(id)) {
                iterator.remove();
                System.out.println("Patient discharged.");
                return;
            }
        }

        System.out.println("Patient not found.");
    }

    public static void sortPatients() {
        Collections.sort(patientList, (p1, p2) -> {
            if (p2.getAge() != p1.getAge()) {
                return p2.getAge() - p1.getAge();
            }
            return p1.getFullName().compareToIgnoreCase(p2.getFullName());
        });

        for (Patient p : patientList) {
            System.out.println(p);
        }
    }

    public static void main(String[] args) {

        while (true) {
            System.out.println("\n===== HOSPITAL MENU =====");
            System.out.println("1. Add Patient");
            System.out.println("2. Update Diagnosis");
            System.out.println("3. Discharge Patient");
            System.out.println("4. Sort Patients");
            System.out.println("5. Exit");
            System.out.print("Choose: ");

            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1 -> addPatient();
                case 2 -> updateDiagnosis();
                case 3 -> dischargePatient();
                case 4 -> sortPatients();
                case 5 -> {
                    System.out.println("Exiting...");
                    return;
                }
                default -> System.out.println("Invalid choice!");
            }
        }
    }
}