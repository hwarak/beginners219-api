package com.beginus.beginners219.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class DefaultRes<T> {

    private int statusCode;
    private String responseMessage;
    private T data;

    public DefaultRes(final int statusCode, final String responseMessage) {
        this.statusCode = statusCode;
        this.responseMessage = responseMessage;
        this.data = null;
    }

    public static <T> DefaultRes<T> res(final int statusCode, final String responseMessage) {
        return res(statusCode, responseMessage, null);
    }

    // 빌드 패턴
    public static <T> DefaultRes<T> res(final int statusCode, final String responseMessage, final T t) {
        return DefaultRes.<T>builder()
                .statusCode(statusCode)
                .responseMessage(responseMessage)
                .data(t)
                .build();
    }

}