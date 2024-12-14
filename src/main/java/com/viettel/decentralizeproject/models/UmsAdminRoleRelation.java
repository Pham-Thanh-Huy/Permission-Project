package com.viettel.decentralizeproject.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity(name = "ums_admin_role_relation")
public class UmsAdminRoleRelation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "admin_id")
    private Long adminId;

    @Column(name = "role_id")
    private Long roleId;
}
