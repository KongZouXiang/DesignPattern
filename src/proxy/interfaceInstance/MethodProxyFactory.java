package proxy.interfaceInstance;

import java.lang.reflect.Proxy;

public class MethodProxyFactory {
    public static <T> T newInstance(Class<T> methodInterface) {

        final MethodProxy<T> methodProxy = new MethodProxy<T>(methodInterface);
        return (T) Proxy.newProxyInstance(
                Thread.currentThread().getContextClassLoader(),
                new Class[]{methodInterface},
                methodProxy);
    }
}