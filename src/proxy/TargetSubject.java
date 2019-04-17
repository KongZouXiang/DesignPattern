package proxy;


public class TargetSubject implements Subject {

    @Override
    public String getResponse(String url) {
        System.out.println("miss08, 执行业务方法：getResponse ." + url);
        return "2017/10/03 21:56";
    }

    @Override
    public void getCookie(String url) {
        System.out.println("miss08, 执行业务方法：getCookie ." + url);
    }

    @Override
    public String getUpdateTime() {

        System.out.println("miss08, 执行业务方法：getUpdateTime .");
        long time = System.currentTimeMillis();
        return String.valueOf(time);
    }
}
