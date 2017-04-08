package Proxy;

import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by tmnt on 2017/4/5.
 */



public class ProxyDemo {
    public static void main(String[] args) {

        StaticProxy proxy = new StaticProxy(new Real());

        proxy.prepare();
        proxy.sing();
        proxy.handle();

        System.out.println("##############");
        //¶¯Ì¬´úÀí
        Real real = new Real();

        Procyhandle procyhandle = new Procyhandle(real);

        Star star = (Star) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), new Class[]{Star.class}, procyhandle);

        star.sing();

    }
}
