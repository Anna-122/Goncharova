package lesson16;

/**
 * Created by Student on 11.10.2019.
 */
public class SimpleGen<T,V,K> {
    private T ob1;
    private V ob2;
    private K ob3;

    public SimpleGen(T ob1, V ob2, K ob3) {
        this.ob1 = ob1;
        this.ob2 = ob2;
        this.ob3 = ob3;
    }

    public T getOb1() {
        return ob1;
    }

    public V getOb2() {
        return ob2;
    }

    public K getOb3() {
        return ob3;
    }

    public void setOb1(T ob1) {
        this.ob1 = ob1;
    }

    public void setOb2(V ob2) {
        this.ob2 = ob2;
    }

    public void setOb3(K ob3) {
        this.ob3 = ob3;
    }
     public  void ShowTypes(){
         System.out.println(ob1.getClass().getName());
         System.out.println(ob2.getClass().getName());
         System.out.println(ob3.getClass().getName());

     }

    public static void main(String[] args) {
         SimpleGen<Integer,String,Double>simpleGen=
                 new SimpleGen<>(4,"string",4.7);
         simpleGen.ShowTypes();
    }
}
