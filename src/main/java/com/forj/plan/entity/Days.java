package com.forj.plan.entity;

import jakarta.persistence.*;
import lombok.Getter;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Getter
@Entity
public class Days extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "plans_id")
    private Plans plans;

    @Column(name = "day_num", nullable = false)
    private int dayNum;

    @Column(name = "day_date", nullable = false)
    private LocalDateTime dayDate;

    @OneToMany(mappedBy = "days", cascade = CascadeType.ALL)
    private List<Times> times = new ArrayList<>();
}
