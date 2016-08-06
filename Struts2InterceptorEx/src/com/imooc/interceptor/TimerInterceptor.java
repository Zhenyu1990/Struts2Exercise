package com.imooc.interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class TimerInterceptor extends AbstractInterceptor {

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		long start = System.currentTimeMillis();
		// ִ����һ��������. ����Ѿ������һ��������, ��ִ��Ŀ��Action
		String result = invocation.invoke();
		long end = System.currentTimeMillis();
		System.out.println("ִ��Action���ѵ�ʱ��Ϊ" + (end - start) + "ms");
		// ���ؽ����ͼ
		return result;
	}

}
