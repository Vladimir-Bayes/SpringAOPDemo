package com.yiibai.aop;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

/** 
* @author ����Vladimir E-mail: gyang.shines@gmail.com
* @version ����ʱ�䣺2017��12��8�� ����5:10:55 
* ��˵�� 
*/
public class HijackBeforeMethod implements MethodBeforeAdvice {

	public void before(Method method, Object[] args, Object target)
			throws Throwable {
		        System.out.println("HijackBeforeMethod : Before method hijacked!");
		}
}
