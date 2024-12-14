package com.viettel.decentralizeproject.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "ums_role_resource_relation")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UmsRoleResourceRelation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "role_id")
    private long roleId;

    @Column(name = "resource_id")
    private long resourceId;
}
