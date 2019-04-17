package proxy.interfaceInstance;

public class Main {

    private MethodInterface method;

    public static void main(String[] args) throws Exception {


        MethodInterface method = MethodProxyFactory.newInstance(MethodInterface.class);
        method.helloWorld();
    }


}
