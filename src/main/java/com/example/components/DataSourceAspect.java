package com.example.components;

import com.example.annotation.DbSource;
import com.example.utils.DynamicDataSourceHolder;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

@Aspect
@Component
public class DataSourceAspect {

    @Pointcut("@annotation(com.example.annotation.DbSource)")
    public void dbSourceAspect() {}

    @Before("dbSourceAspect()")
    public void doBefore(JoinPoint joinPoint) {

        Class<?> target = joinPoint.getTarget().getClass();
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();

        for (Class<?> clazz : target.getInterfaces()) {
            resolveDataSource(clazz,signature.getMethod());
        }
        resolveDataSource(target,signature.getMethod());

    }

    private void resolveDataSource(Class<?> clazz, Method method) {

        try {
            Class<?>[] types = method.getParameterTypes();

            if (clazz.isAnnotationPresent(DbSource.class)) {
                DbSource source = clazz.getAnnotation(DbSource.class);
                DynamicDataSourceHolder.setDataSource(source.value());
            }

            Method m = clazz.getMethod(method.getName(), types);
            if (m != null && m.isAnnotationPresent(DbSource.class)) {
                DbSource source = m.getAnnotation(DbSource.class);
                DynamicDataSourceHolder.setDataSource(source.value());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @After("dbSourceAspect()")
    public void clearDataSource(JoinPoint joinPoint) {
        DynamicDataSourceHolder.clearDataSource();
    }

}
