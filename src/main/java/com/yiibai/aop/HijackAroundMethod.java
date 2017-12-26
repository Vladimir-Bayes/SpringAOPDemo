package com.yiibai.aop;

import java.util.Arrays;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/** 
* @author ����Vladimir E-mail: gyang.shines@gmail.com
* @version ����ʱ�䣺2017��12��8�� ����5:28:51 
* ��˵�� 
*/
public class HijackAroundMethod implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation methodInvocation) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("Method name : "
				+ methodInvocation.getMethod().getName());
		System.out.println("Method arguments : "
				+ Arrays.toString(methodInvocation.getArguments()));

		// same with MethodBeforeAdvice
		System.out.println("HijackAroundMethod : Before method hijacked!");

		try {
			// proceed to original method call
			Object result = methodInvocation.proceed();

			// same with AfterReturningAdvice
			System.out.println("HijackAroundMethod : Before after hijacked!");

			return result;

		} catch (IllegalArgumentException e) {
			// same with ThrowsAdvice
			System.out.println("HijackAroundMethod : Throw exception hijacked!");
			throw e;
		}
	}

}
