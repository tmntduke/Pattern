package Singleton;

/**
 * Created by tmnt on 2017/3/30.
 */

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 饿汉式
 * 初始化快 线程安全
 */
class Singleton1 {

    private static Singleton1 singleton1 = new Singleton1();

    private Singleton1() {
        System.out.println("this is a singleton1");
    }

    public static Singleton1 getInstance() {
        return singleton1;
    }
}

/**
 * 懒汉式
 * 延迟加载 线程不安全
 */
class Singleton2 implements Serializable{
    private static Singleton2 singleton2;

    private Singleton2() {
        System.out.println("this is singleton2");
    }

    public static Singleton2 getInstance() {
        if (singleton2 == null) {
            singleton2 = new Singleton2();
        }
        return singleton2;
    }

    public Object readResolve(){
        return singleton2;
    }
}

/**
 * 加锁懒汉式
 */
class Singleton3 {
    private static Singleton3 singleton3;

    private Singleton3() {

    }

    public static Singleton3 getInstance() {
        synchronized (Singleton3.class) {
            if (singleton3 == null) {
                singleton3 = new Singleton3();
            }
            return singleton3;
        }
    }
}


/**
 * 双重检验锁
 */
class Singleton4 {
    private static Singleton4 singleton4;

    private Singleton4() {

    }

    public static Singleton4 getInstance() {
        if (singleton4 == null) {
            synchronized (Singleton4.class) {
                if (singleton4 == null) {
                    singleton4 = new Singleton4();
                }
            }
        }
        return singleton4;
    }
}

/**
 * 不能通过反射和序列化破解 同时线程安全
 */
enum Singleton5 {

    SINGLETON_5;

    public void doSomething() {
        System.out.println("this is a enum");
    }
}

class Singleton6 {
    private Singleton6() {
    }

    private static class SingletonHolder {
        static Singleton6 singleton6 = new Singleton6();
    }

    public static Singleton6 getInstance() {
        return SingletonHolder.singleton6;
    }
}

public class SingletonDemo {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException
            , InvocationTargetException, InstantiationException, IOException {

        Singleton1 singleton1 = Singleton1.getInstance();

        Singleton2 singleton2 = Singleton2.getInstance();

        System.out.println(singleton2);

        Singleton5 singleton5 = Singleton5.SINGLETON_5;
        singleton5.doSomething();

        //反射破解
        Class<Singleton2> clazz = (Class<Singleton2>) Class.forName("Singleton.Singleton2");
        Constructor constructor = null;
        try {
            constructor = clazz.getDeclaredConstructor(null);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }

        constructor.setAccessible(true);

        Singleton2 singleton6 = (Singleton2) constructor.newInstance();
        System.out.println(singleton6);

        //序列化
        FileOutputStream fileOutputStream=new FileOutputStream("f:\\test\\a.txt");
        ObjectOutputStream outputStream=new ObjectOutputStream(fileOutputStream);

        outputStream.writeObject(singleton2);

        fileOutputStream.close();
        outputStream.close();

        FileInputStream fileInputStream=new FileInputStream("f:\\test\\a.txt");
        ObjectInputStream inputStream=new ObjectInputStream(fileInputStream);

        Singleton2 s= (Singleton2) inputStream.readObject();
        System.out.println(s);

        fileInputStream.close();
        inputStream.close();
    }
}
