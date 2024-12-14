package com.viettel.decentralizeproject.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity(name = "ums_resource_category")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UmsResourceCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "create_time", columnDefinition = "DATETIME")
    private LocalDateTime createTime;

    @Column(name = "name", length = 200)
    private String name;

}
