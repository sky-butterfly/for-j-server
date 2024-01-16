package com.forj.plan.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

public enum PlanType {

    A(1)
    ,B(2)
    ,C(3)
    ,D(4)
    ,E(5);

    private int code;

    PlanType(int i) {
    }
}
