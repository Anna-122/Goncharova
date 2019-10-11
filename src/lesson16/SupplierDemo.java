package lesson16;
import jdk.internal.cmm.SystemResourcePressureImpl;

import java.util.function.Supplier;

/**
 * Created by Student on 11.10.2019.
 */
public class SupplierDemo {
    public static void main(String[] args) {
        Supplier<Integer>supplier =()->(int)(Math.random()*10);
        System.out.println(supplier.get());
    }
}
