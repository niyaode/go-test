package net.sdake.oauthserver.entities;

import org.springframework.stereotype.Component;

//@AllArgsConstructor
//@NoArgsConstructor
//@Data
//@Accessors(chain = true)
@Component
public class JsonEntity<T> {
    //{code: 1, msg: "保存成功！", data: "", url: "/admin/role/index.html", wait: 3}
    private boolean succeed = false;
    private int httpCode = 200;
    private int code = 0;
    private String msg = "成功";
    private T data;
    private String url = "/";
    private float wait = 3;

    public JsonEntity() {
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public JsonEntity(boolean succeed, int httpCode, String msg, T data, String url, float wait) {
        this.succeed = succeed;
        this.httpCode = httpCode;
        this.msg = msg;
        this.data = data;
        this.url = url;
        this.wait = wait;
    }

    public boolean isSucceed() {
        return succeed;
    }

    public void setSucceed(boolean succeed) {
        this.succeed = succeed;
    }

    public int getHttpCode() {
        return httpCode;
    }

    public void setHttpCode(int httpCode) {
        this.httpCode = httpCode;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public float getWait() {
        return wait;
    }

    public void setWait(float wait) {
        this.wait = wait;
    }
}
