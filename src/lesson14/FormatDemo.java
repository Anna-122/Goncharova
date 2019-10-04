package lesson14;

/**
 * Created by Student on 04.10.2019.
 */
public class FormatDemo {
    public static void main(String[] args) {
        print( "Петров", "математике",5);
        print( "Сидоров", "литературе",5);
        print( "Иванов", "программирование",5);
    }
    public static void print(String fullName,String subject,int mark){
        System.out.printf("Студент %15s получил %3d по %15s", fullName, mark,subject);
    }
}
