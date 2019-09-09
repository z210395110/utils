package com.zhaoshuaixi.common.utils;

import org.junit.Test;

import com.zsx.common.utils.StringUtil;

public class StringUtilTest {
	@Test
	public void toHtmlTest() {
		//一次合法的邮箱，测试通过
		String str = "9月5日一大早，又有了新情况";
		String html = StringUtil.toHtml(str);
		System.out.println(html);
		
	}
	@Test
	public void isPhoneTest() {
		//传一个非法的手机号码测试不通过
		String str ="1235485687";
		//。传一次合法的手机号码，测试通过
		String str1 ="15512712556";
		//测试非法
		boolean b = StringUtil.isPhoneNumber(str);
		//测试合法
		boolean b1 = StringUtil.isPhoneNumber(str1);
		System.out.println(b+"手机号错误");
		System.out.println(b1+"手机号正确");
		
	}
	@Test
	public void isEmailTest() {
		//一次合法的邮箱，测试通过
		String email = "advds@163.com";
		//传一个非法的邮箱测试不通过
		String email1 = "2101qq.com";
		boolean b = StringUtil.isEmail(email);
		boolean b1 = StringUtil.isEmail(email1);
		System.out.println(b+"邮箱正确");
		System.out.println(b1+"非法邮箱,请重新输入");
	}

}
