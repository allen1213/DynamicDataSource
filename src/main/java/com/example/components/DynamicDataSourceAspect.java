package com.example.components;

import com.example.annotation.SwitchTo;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class DynamicDataSourceAspect {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @Before(
            value = "@annotation(switchTo)"
    )
    public void switchToDBKey(JoinPoint joinPoint, SwitchTo switchTo) {
        Class<?> target = joinPoint.getTarget().getClass();
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        System.out.println("target : " + target.toString());
        System.out.println("signature : " + signature.toString());
    }

}
