package com.viettel.decentralizeproject.common.api;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CommonResponse<T> {
    public T data;
    public Message message;


    public static <T> CommonResponse<T> success(T data) {
        return new CommonResponse<>(data, Message.returnMessageEnum(StatusResult.SUCCESS));
    }
}
