package session13.lesson1;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Double> nhietdo=new ArrayList<>();

        nhietdo.add(36.5);
        nhietdo.add(40.2);
        nhietdo.add(37.0);
        nhietdo.add(12.5);
        nhietdo.add(39.8);
        nhietdo.add(99.9);
        nhietdo.add(36.8);
        System.out.println("Danh sach ban dau: "+nhietdo);
        Iterator<Double> iterator = nhietdo.iterator();
        while (iterator.hasNext()){
            Double temp=iterator.next();

            if(temp<34.0 || temp>42.0){
                iterator.remove();
            }
        }
        System.out.println("Danh sach sau khi loc: "+nhietdo);

        double sum=0;
        for(double temp : nhietdo){
            sum+=temp;
        }
        double average=sum / nhietdo.size();

        System.out.printf("Nhiet do trung binh:%.2f",average);
    }

}
