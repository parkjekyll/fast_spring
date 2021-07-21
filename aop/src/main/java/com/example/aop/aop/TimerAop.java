package com.example.aop.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

@Aspect
@Component//스프링에서 관리해줘!  *bean 은 클래스에 붙일 수 없다 메소드에서 bean 사용할 수 있다.*
public class TimerAop {

    @Pointcut("execution(* com.example.aop.controller..*.*(..))") //컨트롤러 하위 모두
    private void cut(){}

    @Pointcut("@annotation(com.example.aop.annotation.Timer)")
    private void enableTimer(){
    }

    @Around("cut() && enableTimer()")
    public void around(ProceedingJoinPoint joinPoint) throws Throwable {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();

        Object result = joinPoint.proceed();

        stopWatch.stop();

        System.out.println("total Time : "+stopWatch.getTotalTimeSeconds());
    }
}
