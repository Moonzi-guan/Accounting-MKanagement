package cn.gcf.zhangwuguanli.utils;

import java.util.ArrayList;
import java.util.List;

public class PagesUtils<T> {

	private int code;
	private String msg;
	private Long count;
	private List<T> data = new ArrayList();
	
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public Long getCount() {
		return count;
	}
	public void setCount(Long count) {
		this.count = count;
	}
	public List<T> getData() {
		return data;
	}
	public void setData(List<T> data) {
		this.data = data;
	}
			
			
	
}
