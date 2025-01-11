package com.forj.plan.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QTimes is a Querydsl query type for Times
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QTimes extends EntityPathBase<Times> {

    private static final long serialVersionUID = -1380760800L;

    public static final QTimes times = new QTimes("times");

    public final StringPath contents = createString("contents");

    public final NumberPath<Long> daysId = createNumber("daysId", Long.class);

    public final StringPath details = createString("details");

    public final DateTimePath<java.time.LocalDateTime> endTime = createDateTime("endTime", java.time.LocalDateTime.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final DateTimePath<java.time.LocalDateTime> startTime = createDateTime("startTime", java.time.LocalDateTime.class);

    public QTimes(String variable) {
        super(Times.class, forVariable(variable));
    }

    public QTimes(Path<? extends Times> path) {
        super(path.getType(), path.getMetadata());
    }

    public QTimes(PathMetadata metadata) {
        super(Times.class, metadata);
    }

}

