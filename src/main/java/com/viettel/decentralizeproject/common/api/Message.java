package com.viettel.decentralizeproject.common.api;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Message {
    public String message;
    public int status;


    public static Message returnMessageEnum(StatusResult statusResult) {
        return new Message(statusResult.getMessage(), statusResult.getStatus());
    }

}
