package com.viettel.decentralizeproject.common.api;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public enum StatusResult {
    SUCCESS("Success!", 200),
    FAILED("Failed!", 500),
    VALIDATE_FAILED("Validate failed!", 404),
    UNAUTHORIZED("Unauthorized!", 401),
    FORBIDDEN("Forbidden!", 403),
    INTERNAL_SERVER_ERROR("Internal server error!", 500),
    BAD_REQUEST("Bad request!", 400),
    NOT_FOUND("Not found!", 404);

    private String message;
    private int status;
}
