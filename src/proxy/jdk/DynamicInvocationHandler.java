package proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class DynamicInvocationHandler implements InvocationHandler {

    private Object object;


    public DynamicInvocationHandler(Object object) {
        this.object = object;
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Exception {

        System.out.println("miss08, 开始执行代理方法，处理的方法是 ： " + method.getName());

        //通过反射获取到接口的method，执行subject目标对象中带参数args的method方法
        String response = (String) method.invoke(object, args);

        System.out.println("miss08, 业务方法处理完毕,响应结果是 ： " + response);
        return response;
    }
}
