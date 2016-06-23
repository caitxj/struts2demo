package com.cai.util;

import java.util.ArrayList;
import java.util.List;

public class Counter {

	private int last;
	
	private List<String> list;

	public int getLast() {
		return last;
	}

	public void setLast(int last) {
		this.last = last;
		list=new ArrayList<>();
		for(int i=0;i<last;i++){
			list.add(++i+"");
		}
	}

	public List<String> getList() {
		return list;
	}

	public void setList(List<String> list) {
		this.list = list;
	}
	
	
	
	
	
	
}
