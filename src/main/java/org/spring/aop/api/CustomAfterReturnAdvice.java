package org.spring.aop.api;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class CustomAfterReturnAdvice implements AfterReturningAdvice{

	@Override
	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
		 System.out.println("CustomAfterReturnAdvice:" + method.getName() + "        "
	                + target.getClass().getName() + "       " + returnValue);
	}
}
