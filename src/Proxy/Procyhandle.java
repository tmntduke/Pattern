package Proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by tmnt on 2017/4/5.
 */
public class Procyhandle implements InvocationHandler {

    private Star star;

    public Procyhandle(Star star) {
        this.star = star;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("dynamic proxy prepare");

        Object obj=null;

        if (method.getName().equals("sing")){
           obj= method.invoke(star,args);
        }

        System.out.println("dynamic proxy handle");

        return obj;
    }
}
