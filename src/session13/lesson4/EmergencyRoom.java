package session13.lesson4;

import java.util.LinkedList;

public class EmergencyRoom {

    private LinkedList<String> watingList = new LinkedList<>();
     public void patientCheckIn(String name){
         watingList.addLast(name);
     }

     public void emergencyCheckIn(String name){
         watingList.addFirst(name);
     }
     public void treatPatient(){
         if(watingList.isEmpty()){
             System.out.println("Khong co benh nhan dang doi");
             return;
         }
         String patient = watingList.removeFirst();
         if (patient.equals("C")) {
             System.out.println("Đang cấp cứu: " + patient);
         } else {
             System.out.println("Đang khám: " + patient);
         }
     }

    public static void main(String[] args) {

        EmergencyRoom er = new EmergencyRoom();

        er.patientCheckIn("A");
        er.patientCheckIn("B");
        er.emergencyCheckIn("C");

        er.treatPatient();
        er.treatPatient();
        er.treatPatient();
    }
}
