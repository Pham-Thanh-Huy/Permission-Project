package com.viettel.decentralizeproject.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UmsAdminParam {
    @NotBlank
    private String username;

    @NotBlank
    private String password;

    private String icon;

    @Email
    private String email;

    private String nickName;

    private String note;
}
