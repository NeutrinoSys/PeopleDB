package com.neutrinosys.peopledb.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface MultiSQL {
    SQL[] value();
}
