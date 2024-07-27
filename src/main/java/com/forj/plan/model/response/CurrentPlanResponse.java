package com.forj.plan.model.response;

import com.forj.plan.enums.PlanType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CurrentPlanResponse {

    private PlanType type;
}
