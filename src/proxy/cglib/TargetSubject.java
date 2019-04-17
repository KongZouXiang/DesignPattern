package proxy.cglib;


public class TargetSubject  {


    public String getResponse(String url) {
        System.out.println("miss08, 执行业务方法：getResponse ." + url);
        return "2017/10/03 21:56";
    }


    public void getCookie(String url) {
        System.out.println("miss08, 执行业务方法：getCookie ." + url);
    }


    public String getUpdateTime() {

        System.out.println("miss08, 执行业务方法：getUpdateTime .");
        long time = System.currentTimeMillis();
        return String.valueOf(time);
    }
}
