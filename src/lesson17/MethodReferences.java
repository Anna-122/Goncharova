package lesson17;

import java.util. function.IntFunction;
public class MethodReferences {
    public static void main(String[] args) {


        IntFunction<String> function =  String::valueOf;
        System.out.println(function.apply(450));
    }
}
