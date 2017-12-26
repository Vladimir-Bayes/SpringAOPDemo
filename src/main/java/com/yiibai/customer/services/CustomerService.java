package com.yiibai.customer.services;
/** 
* @author 作者Vladimir E-mail: gyang.shines@gmail.com
* @version 创建时间：2017年12月8日 下午5:12:53 
* 类说明 
*/
public class CustomerService {
	private String name;
	private String url;

	public void setName(String name) {
		this.name = name;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public void printName() {
		System.out.println("Customer name : " + this.name);
	}

	public void printURL() {
		System.out.println("Customer website : " + this.url);
	}

	public void printThrowException() {
		throw new IllegalArgumentException();
	}
}
