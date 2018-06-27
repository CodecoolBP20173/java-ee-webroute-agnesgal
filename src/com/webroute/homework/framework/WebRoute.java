package com.codecool.ownWebRouteReference.framework;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public  @interface WebRoute {
    // The default parameter
    String value();
}