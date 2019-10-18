package lesson17;

import java.time.LocalDate;
import java.util.ArrayList;
 import java.util.List;
/**
 * Created by Student on 18.10.2019.
 */
public class ArrayListDemo {
    public static void main(String[] args) {
        List<LocalDate> list = new  ArrayList<>();
        list.add(LocalDate.now());
        list.add(LocalDate.of(2019,2,6));
        list.add(LocalDate.of(2018,10,4));
        System.out.println(list.size());
        System.out.println(list);

       for(LocalDate date:list){
            System.out.println("Element"+date);

        }
        list.forEach((element)->System.out.println(element));

        list.remove(list.size()-1);
        System.out.println();
        list.forEach((element)->  System.out.println(element));
    }
}
