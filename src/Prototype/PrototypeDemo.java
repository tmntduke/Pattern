package Prototype;

import java.util.Date;

/**
 * Created by tmnt on 2017/4/2.
 */
public class PrototypeDemo {
    public static void main(String[] args) throws CloneNotSupportedException {

        //Ç³¿½±´
        Date date=new Date();

        Copy copy = new Copy("006", "tmnt", date);
        System.out.println(copy.hashCode());
        System.out.println(copy.toString());
        System.out.println("#############");


        Copy copy1 = (Copy) copy.clone();
        copy1.setName("duke");
        System.out.println(copy1.hashCode());
        System.out.println(copy1.toString());

        System.out.println("################");

        date.setTime(20000000);

        System.out.println(copy.toString());
        System.out.println(copy1.toString());


    }
}
