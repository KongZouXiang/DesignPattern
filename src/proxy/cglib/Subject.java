package proxy.cglib;

public interface Subject {

    String getResponse(String url);

    void getCookie(String url);

    String getUpdateTime();
}
