package com.forj.plan.model.response;

import com.forj.plan.entity.Days;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DayResponse {

    private Long id;

    private int dayNum;

    private LocalDateTime dayDate;

    public static DayResponse of(Days days) {
        return DayResponse.builder()
                .id(days.getId())
                .dayNum(days.getDayNum())
                .dayDate(days.getDayDate())
                .build();
    }
}