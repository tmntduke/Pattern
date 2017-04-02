package Prototype;

import java.util.Date;

/**
 * Created by tmnt on 2017/4/2.
 */
public class PrototypeDemo1 {
    public static void main(String[] args) throws CloneNotSupportedException {

        //Éî¿½±´
        Date date=new Date();

        DeepCopy copy = new DeepCopy("tmnt", date);
        System.out.println(copy.hashCode());
        System.out.println(copy.toString());
        System.out.println("#############");


        DeepCopy copy1 = (DeepCopy) copy.clone();
        copy1.setName("duke");
        System.out.println(copy1.hashCode());
        System.out.println(copy1.toString());

        System.out.println("################");

        date.setTime(20000000);

        System.out.println(copy.toString());
        System.out.println(copy1.toString());


    }
}
