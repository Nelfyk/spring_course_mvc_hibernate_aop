package com.ruslanburduzhan.spring.mvc_hibernate_aop.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

@Component
@Aspect
public class MyLoggingAspect {

    @Around("execution(* com.ruslanburduzhan.spring.mvc_hibernate_aop.dao.EmployeeDAOImpl.*(..))")
    public Object aroundAllRepositoryMethodAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable, IOException {
        MethodSignature methodSignature = (MethodSignature) proceedingJoinPoint.getSignature();
/*        FileWriter fileWriter = new FileWriter("D:\\logging.txt", true);
        Date date = new Date();
        fileWriter.write(date + " - BEGIN OF: |" + methodSignature.getName() + "|\n");*/
        System.out.println("BEGIN OF: "+methodSignature.getName());
        Object targetMethodResult = proceedingJoinPoint.proceed();
        System.out.println("END OF: "+methodSignature.getName());
/*        fileWriter.write(date + " - END OF: |" + methodSignature.getName() + "|\n");
        fileWriter.close();*/
        return targetMethodResult;
    }
}
