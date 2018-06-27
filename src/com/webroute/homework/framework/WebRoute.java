package com.webroute.homework.framework;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Retention(value=RUNTIME)
@Target(ElementType.METHOD)
public  @interface WebRoute {
    String value();
}