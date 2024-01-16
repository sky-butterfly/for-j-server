package com.forj.plan.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Days extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "plans_id", nullable = false)
    private Long plansId;

    @Column(name = "day_num", nullable = false)
    private Integer dayNum;

    @Column(name = "day_date", nullable = false)
    private LocalDateTime dayDate;
}
