package proxy.cglib;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Main {

    public static void main(String[] args) {

        TargetSubject target = new TargetSubject();
        Cglib  cglib=new Cglib();
        TargetSubject bookCglib=(TargetSubject)cglib.getInstance(target);
        bookCglib.getCookie("12");
    }

}
