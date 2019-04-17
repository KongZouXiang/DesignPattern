package proxy.jdk;

import proxy.cglib.Cglib;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Main {

    public static void main(String[] args) {

        TargetSubject targetSubject = new TargetSubject();
        InvocationHandler handler = new DynamicInvocationHandler(targetSubject);


        //创建代理类的实例
        Subject proxySubject = (Subject) Proxy.newProxyInstance(targetSubject.getClass()
                        .getClassLoader()
                , targetSubject.getClass().getInterfaces()
                , handler);

        //调用代理类的getResponse方法
        proxySubject.getResponse("http://192.168.1.100:8080/currentTime");

        proxySubject.getCookie("111");
    }
}
