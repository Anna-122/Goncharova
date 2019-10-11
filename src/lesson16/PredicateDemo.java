package lesson16;

/**
 * Created by Student on 11.10.2019.
 */
import java.util.function.Predicate;
public class PredicateDemo {
    public static void main(String[] args) {
        Predicate<String> predicate=s->s != null;
        Predicate<String> predicate1=s->!s. isEmpty();

         Predicate<String>andPredcate =predicate.and(predicate1) ;

        System.out.println(predicate1.test(null));
        System.out.println(predicate1.test(""));
        System.out.println(predicate1.test("string"));

        System.out.println(predicate.test(null));
        System.out.println(predicate.test(""));
        System.out.println(predicate1.test("string"));
    }
}
