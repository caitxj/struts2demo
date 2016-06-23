package com.cai.result;

import java.io.PrintWriter;

import org.apache.struts2.ServletActionContext;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.Result;
import com.opensymphony.xwork2.util.ValueStack;

public class JSONResult implements Result {

	public static final String DEFAULT_PARAM = "classAlias";
	String classAlias;

	public String getClassAlias() {
		return classAlias;
	}

	public void setClassAlias(String classAlias) {
		this.classAlias = classAlias;
	}

	public void execute(ActionInvocation invocation) throws Exception {
		ServletActionContext.getResponse().setContentType("text/plain");
		PrintWriter responseStream = ServletActionContext.getResponse().getWriter();
		ValueStack valueStack = invocation.getStack();
		Object jsonModel = valueStack.findValue("jsonModel");
		String jsonObj = JSONObject.toJSONString(jsonModel);
		responseStream.write(jsonObj);
	}

}
