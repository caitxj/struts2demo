package com.cai.interceptor;

import java.util.Map;

import org.apache.commons.lang3.StringUtils;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class AuthenticationInterceptor implements Interceptor {
	public static  int  count=0;
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("destoried......................-============================0------------------------------------->");
	}

	@Override
	public void init() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		count++;
		System.out.println("accesss times:"+count);
		Map session=invocation.getInvocationContext().getSession();
		String user=(String)session.get("user");
//		if(StringUtils.isBlank(user)){
//			return Action.LOGIN;
//		}else{
			String result= invocation.invoke();
			System.out.println("result:"+result);
			
			System.out.println("excute after--------------------------------------------->");
			
			return result;
//		}
	}

}
