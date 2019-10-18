package lesson17;
import java.util. function.IntFunction;
import java.util. function.Supplier;
public class MethodReferences2 {
    public static void main(String[] args) {


        Supplier<String> newString =   String::new;
        System.out.println(newString.get());

    }
}