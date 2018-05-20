package org.spring.aop.api;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class CustomBeforeAdvice implements MethodBeforeAdvice{

	@Override
	public void before(Method method, Object[] args, Object target) throws Throwable {
		System.out.println("CustomBeforeAdvice:" + method.getName() + "     " +target.getClass().getName());
	}

}
