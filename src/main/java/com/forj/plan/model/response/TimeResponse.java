package com.forj.plan.model.response;

import com.forj.plan.entity.Times;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TimeResponse {

    private Long id;

    private LocalDateTime startTime;

    private LocalDateTime endTime;

    private String contents;

    public static TimeResponse of(Times times) {
        return TimeResponse.builder()
                .startTime(times.getStartTime())
                .endTime(times.getEndTime())
                .contents(times.getContents())
                .build();
    }
}