package com.yiibai.aop;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

/** 
* @author 作者Vladimir E-mail: gyang.shines@gmail.com
* @version 创建时间：2017年12月8日 下午5:10:55 
* 类说明 
*/
public class HijackBeforeMethod implements MethodBeforeAdvice {

	public void before(Method method, Object[] args, Object target)
			throws Throwable {
		        System.out.println("HijackBeforeMethod : Before method hijacked!");
		}
}
