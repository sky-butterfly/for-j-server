package com.forj.plan.entity;

import com.forj.plan.enums.PlanType;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Plans extends BaseEntity{

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "users_id", nullable = false)
    private Long usersId;

    @Column(name = "type", nullable = false)
    private PlanType type;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "is_current", nullable = false)
    private boolean isCurrent;

    @Column(name = "is_deleted", nullable = false)
    private boolean isDeleted;

    @Column(name = "start_date", nullable = false)
    private LocalDateTime startDate;

    @Column(name = "end_date", nullable = false)
    private LocalDateTime endDate;
}
