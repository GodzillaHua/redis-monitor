package io.panda.devops.redis.web;

/**
 * @author godzillahua
 **/
public class ApiResult<T> {

    private Integer code = 200;
    private String message;
    private T data;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public ApiResult<T> code(Integer code) {
        this.code = code;
        return this;
    }

    public ApiResult<T> message(String message) {
        this.message = message;
        return this;
    }

    public ApiResult<T> data(T data) {
        this.data = data;
        return this;
    }
}
