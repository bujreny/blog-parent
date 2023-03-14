package com.bujreny.blog.common.aop;

import java.lang.annotation.*;

// Type代表可以放在类上面， Method代表可以放在方法上
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface LogAnnotation {
    String operator() default "";

    String module() default "";
}
