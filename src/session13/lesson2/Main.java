package session13.lesson2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static List<String> removeDublicateAndSort(List<String>medicineList){
        ArrayList <String> uniqueList = new ArrayList<>();
        for(String medicine:medicineList){
            if(!uniqueList.contains(medicine)){
                uniqueList.add(medicine);
            }
        }
        Collections.sort(uniqueList);
        return uniqueList;
    }
    public static void main(String[] args) {
        List <String> inputList = new ArrayList<>();

        inputList.add("Paracetamol");
        inputList.add("Ibuprofen");
        inputList.add("Panadol");
        inputList.add("Paracetamol");
        inputList.add("Aspirin");
        inputList.add("Ibuprofen");

        System.out.println("Danh sach ban dau "+inputList);

        List<String> result = removeDublicateAndSort(inputList);

        System.out.println("Danh sach sau khi xu li: "+result);
    }
}
