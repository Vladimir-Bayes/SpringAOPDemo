package com.yiibai.aop;

import org.springframework.aop.ThrowsAdvice;

/** 
* @author 作者Vladimir E-mail: gyang.shines@gmail.com
* @version 创建时间：2017年12月8日 下午5:24:43 
* 类说明 
*/
public class HijackThrowException implements ThrowsAdvice {
	public void afterThrowing(IllegalArgumentException e) throws Throwable {
		System.out.println("HijackThrowException : Throw exception hijacked!");
	}
}
