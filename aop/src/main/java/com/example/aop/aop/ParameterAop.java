package com.example.aop.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

@Aspect
@Component //스프링에서 관리해줘!
public class ParameterAop {

    //포인트컷: 기능을 어디에 적용시킬지 메소드 어노테이션 등 AOP를 적용 시킬 지점 설정
    @Pointcut("execution(* com.example.aop.controller..*.*(..))") //컨트롤러 하위 모두
    private void cut(){}

    //언제 실행시킬 것인지?
    //@Before("cut()")
    public void before(JoinPoint joinPoint){
        Object[] args = joinPoint.getArgs(); //메소드에 들어가있는 매개변수 배열

        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        Method method = methodSignature.getMethod();
        System.out.println(method.getName());

        for(Object obj : args){
            System.out.println("type : "+obj.getClass().getSimpleName());
            System.out.println("value : "+obj);
        }
    }
    //@AfterReturning(value = "cut()", returning = "returnObj")
    public void afterReturn(JoinPoint joinPoint, Object returnObj){
        System.out.println("return obj");
        System.out.println(returnObj);

    }
}
