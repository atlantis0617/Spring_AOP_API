package org.spring.aop.api;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class CustomMethodInterceptor implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		System.out.println("CustomMethodInterceptor 1:" + invocation.getMethod().getName() + "     "
				+ invocation.getStaticPart().getClass().getName());
		Object obj = invocation.proceed();
		System.out.println("CustomMethodInterceptor 2:" + obj);
		return obj;
	}

}
