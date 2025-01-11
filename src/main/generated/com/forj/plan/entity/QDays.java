package com.forj.plan.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QDays is a Querydsl query type for Days
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QDays extends EntityPathBase<Days> {

    private static final long serialVersionUID = 1756090685L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QDays days = new QDays("days");

    public final DateTimePath<java.time.LocalDateTime> dayDate = createDateTime("dayDate", java.time.LocalDateTime.class);

    public final NumberPath<Integer> dayNum = createNumber("dayNum", Integer.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final QPlans plans;

    public final ListPath<Times, QTimes> times = this.<Times, QTimes>createList("times", Times.class, QTimes.class, PathInits.DIRECT2);

    public QDays(String variable) {
        this(Days.class, forVariable(variable), INITS);
    }

    public QDays(Path<? extends Days> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QDays(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QDays(PathMetadata metadata, PathInits inits) {
        this(Days.class, metadata, inits);
    }

    public QDays(Class<? extends Days> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.plans = inits.isInitialized("plans") ? new QPlans(forProperty("plans")) : null;
    }

}

