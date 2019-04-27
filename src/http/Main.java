package http;

public class Main {

    public static void main(String[] args) {
        String s = HttpClient.doGet("https://www.cnblogs.com/hhhshct/p/8523697.html");
        System.out.println(s);
    }
}
