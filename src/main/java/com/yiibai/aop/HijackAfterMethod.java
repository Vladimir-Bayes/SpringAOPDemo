package com.yiibai.aop;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

/** 
* @author ����Vladimir E-mail: gyang.shines@gmail.com
* @version ����ʱ�䣺2017��12��8�� ����5:20:57 
* ��˵�� 
*/
public class HijackAfterMethod implements AfterReturningAdvice {
	@Override
	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("HijackAfterMethod : After method hijacked!");
	}

}
