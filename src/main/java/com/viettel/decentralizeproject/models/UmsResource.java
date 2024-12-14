package com.viettel.decentralizeproject.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "ums_resource")
public class UmsResource {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "create_time")
    private LocalDateTime createTime;

    @Column(name = "name", length = 200)
    private String name;

    @Column(name = "url", length = 200)
    private String url;

    @Column(name = "description", length = 500)
    private String description;

    private Long category_id;
}
