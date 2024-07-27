package com.forj.plan.controller;


import com.forj.plan.model.response.ApiResponse;
import com.forj.plan.model.response.CurrentPlanResponse;
import com.forj.plan.model.response.PlanResponse;
import com.forj.plan.service.PlanService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RequestMapping("/plans")
@RestController
public class PlanController {

    private final PlanService planService;

    @GetMapping("/current")
    public ApiResponse<CurrentPlanResponse> getCurrentPlan(@RequestParam("userName") String userName){
        CurrentPlanResponse response = planService.getCurrentPlan(userName);
        return new ApiResponse<>().success(response);
    }

    @GetMapping()
    public ApiResponse<PlanResponse> getPlans(@RequestParam("userId") Long userId) {
        return new ApiResponse<>().success(planService.getPlans(userId));
    }
}
