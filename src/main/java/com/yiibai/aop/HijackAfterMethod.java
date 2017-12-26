package com.yiibai.aop;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

/** 
* @author 作者Vladimir E-mail: gyang.shines@gmail.com
* @version 创建时间：2017年12月8日 下午5:20:57 
* 类说明 
*/
public class HijackAfterMethod implements AfterReturningAdvice {
	@Override
	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("HijackAfterMethod : After method hijacked!");
	}

}
