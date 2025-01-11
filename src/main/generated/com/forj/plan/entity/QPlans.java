package com.forj.plan.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QPlans is a Querydsl query type for Plans
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QPlans extends EntityPathBase<Plans> {

    private static final long serialVersionUID = -1384376764L;

    public static final QPlans plans = new QPlans("plans");

    public final ListPath<Days, QDays> days = this.<Days, QDays>createList("days", Days.class, QDays.class, PathInits.DIRECT2);

    public final DateTimePath<java.time.LocalDateTime> endDate = createDateTime("endDate", java.time.LocalDateTime.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final BooleanPath isCurrent = createBoolean("isCurrent");

    public final BooleanPath isDeleted = createBoolean("isDeleted");

    public final NumberPath<Long> memberId = createNumber("memberId", Long.class);

    public final StringPath name = createString("name");

    public final DateTimePath<java.time.LocalDateTime> startDate = createDateTime("startDate", java.time.LocalDateTime.class);

    public final EnumPath<com.forj.plan.enums.PlanType> type = createEnum("type", com.forj.plan.enums.PlanType.class);

    public QPlans(String variable) {
        super(Plans.class, forVariable(variable));
    }

    public QPlans(Path<? extends Plans> path) {
        super(path.getType(), path.getMetadata());
    }

    public QPlans(PathMetadata metadata) {
        super(Plans.class, metadata);
    }

}

