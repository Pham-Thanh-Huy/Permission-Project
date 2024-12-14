package com.viettel.decentralizeproject.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Comment;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "ums_menu")
public class UmsMenu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "parent_id")
    @Comment("parent_id (cha của field  `id` trong bảng menu - menu đa cấp)")
    private long parentId;

    @Column(name = "create_time", columnDefinition = "DATETIME")
    private LocalDateTime createTime;

    @Column(name = "title", length = 100)
    private String title;

    @Column(name = "level", columnDefinition = "int(4)")
    private Integer level;

    @Column(name = "sort", columnDefinition = "int(4)")
    private Integer sort;

    @Column(name = "name", length = 100)
    private String name;

    @Column(name = "icon", length = 100)
    private String icon;

    @Column(name = "hidden", columnDefinition = "int(1)")
    private Integer hidden;
}
