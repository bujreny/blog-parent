package com.bujreny.blog.handler;

import com.bujreny.blog.vo.Result;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Administrator
 * @description TODO
 * @date 2023/3/9
 */
//对加了 @Controller 注解的方法进行拦截处理 AOP的实现
@ControllerAdvice
public class ALLExceptionhandler {
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public Result doException(Exception e) {
        e.printStackTrace();
        return Result.fail(-999, "系统异常");
    }
}
