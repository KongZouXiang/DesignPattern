package proxy.cglib;

public class Main {

    public static void main(String[] args) {

        System.out.println("123");
        TargetSubject target = new TargetSubject();

        Cglib  cglib=new Cglib();
        TargetSubject bookCglib=(TargetSubject)cglib.getInstance(target);
        bookCglib.getCookie("12");
    }

}
