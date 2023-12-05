package com.example.foyerwiembenaraar.AOP;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
//La classe :Aspect
@Aspect
@Component
@Slf4j
public class FoyerAspect {
    //Methode: Advice

    @Before("execution(* com.example.foyerwiembenaraar.Services..*.*(..))")

    public void method(JoinPoint jp){
        log.info("Banjour Wiwi mazyouna "+jp.getSignature().getName()) ;
    }
    @After("execution(* com.example.foyerwiembenaraar.Services..*.*(..))")
    public void methodAfter(JoinPoint jp){
        log.info("Bye Wiwi mazyouna "+jp.getSignature().getName()) ;

    }
    @Around("execution(* com.example.foyerwiembenaraar.Services..*.*(..))")

    public Object profile(ProceedingJoinPoint pjp)throws Throwable{
        long start =System.currentTimeMillis();
        Object obj=pjp.proceed();
        long elapsedTime=System.currentTimeMillis() - start;
        log.info("Method execution time: " + elapsedTime + "milliseconds.") ;
        return null;
    }
}
