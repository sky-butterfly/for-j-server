package com.forj.plan.entity;

import jakarta.persistence.Column;

import java.time.LocalDateTime;

public class BaseEntity {

    @Column(name = "created_date", nullable = false)
    private LocalDateTime createdDate;

    @Column(name = "modified_date", nullable = false)
    private LocalDateTime modifiedDate;
}
