package com.zemoso.aopdemo.asp;


import com.zemoso.aopdemo.gen.Account;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(1)
public class SampleAspect {

    @Before("com.zemoso.aopdemo.asp.AopExpressions.forDaoPackage()")
    public void beforeAddAccountAdvice(JoinPoint joinPoint){
        System.out.println(" \n\n\n======> Executing advice on addAccount()");

        //Display the method signature
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        System.out.println("Method Signature:" + methodSignature);


        //Display the method arguments
        // get the arguments
        Object[] args = joinPoint.getArgs();

        //loop through the arguments
        for(Object temp : args){
            System.out.println(temp);

            if(temp instanceof Account){
                Account tempAccount  = (Account) temp;

                System.out.println(tempAccount.getName());
                System.out.println(tempAccount.getLevel());

            }
        }

    }
}
