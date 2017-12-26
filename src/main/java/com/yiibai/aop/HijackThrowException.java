package com.yiibai.aop;

import org.springframework.aop.ThrowsAdvice;

/** 
* @author ����Vladimir E-mail: gyang.shines@gmail.com
* @version ����ʱ�䣺2017��12��8�� ����5:24:43 
* ��˵�� 
*/
public class HijackThrowException implements ThrowsAdvice {
	public void afterThrowing(IllegalArgumentException e) throws Throwable {
		System.out.println("HijackThrowException : Throw exception hijacked!");
	}
}
