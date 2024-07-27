package com.forj.plan.model.response;

import com.forj.plan.entity.Plans;
import com.forj.plan.enums.PlanType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PlanResponse {

    private Long id;

    private PlanType type;

    private String name;

    private boolean isCurrent;

    public static PlanResponse of(Plans plans) {
        return PlanResponse.builder()
                .id(plans.getId())
                .type(plans.getType())
                .name(plans.getName())
                .isCurrent(plans.isCurrent())
                .build();
    }
}