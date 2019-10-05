package cn.gcf.zhangwuguanli.utils;

public class PictureResultMap<T> {
	private String SuccessCode;
	private T data;
	
	public String getSuccessCode() {
		return SuccessCode;
	}
	public void setSuccessCode(String successCode) {
		SuccessCode = successCode;
	}
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	
	public PictureResultMap(String successCode, T data) {
		SuccessCode = successCode;
		this.data = data;
	}
	
	
	
}
