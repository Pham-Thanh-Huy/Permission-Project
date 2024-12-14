package com.viettel.decentralizeproject.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Comment;

import java.time.LocalDateTime;

@Data
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "ums_role")
public class UmsRole {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", length = 100)
    @Comment("Tên quyền")
    private String name;

    @Column(name = "description", length = 500)
    @Comment("Mô tả")
    private String description;

    @Column(name = "admin_count", columnDefinition = "int(11)")
    private Integer adminCount;

    @Column(name = "create_time", columnDefinition = "datetime")
    private LocalDateTime createTime;

    @Column(name = "status", columnDefinition = "int(1) DEFAULT '1'")

    private Integer status;

    @Column(name = "sort", columnDefinition = "int(11) DEFAULT '0'")
    private Integer sort;
}
