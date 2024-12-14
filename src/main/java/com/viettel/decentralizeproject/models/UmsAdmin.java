package com.viettel.decentralizeproject.models;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "ums_admin")
public class UmsAdmin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    @Column(name = "icon", length = 500)
    private String icon;

    @Column(name = "email", length = 100)
    private String email;

    @Column(name = "nick_name", length = 200)
    private String nickName;

    @Column(name = "note", length = 500)
    private String note;

    @Column(name = "create_time", columnDefinition = "DATETIME")
    private LocalDateTime createTime;

    @Column(name = "login_time", columnDefinition = "DATETIME")
    private LocalDateTime loginTime;

    @Column(name = "status", columnDefinition = "int(1) DEFAULT '1' COMMENT 'status account: 1->active, 2->disable'", nullable = false)
    private Integer status;

}
