package com.guo.base.enums;

public enum RespCodeEnums {

	RESP_CODE_SUCCESS(ResponseUtil.RESP_CODE_SUCCESS,"系统响应成功"),
	RESP_CODE_EXCEPTION(ResponseUtil.RESP_CODE_EXCEPTION,"系统响应异常"),
	RESP_CODE_ERROR(ResponseUtil.RESP_CODE_ERROR,"系统业务处理错误");

	private Integer code;
	private String remark;

	private RespCodeEnums(Integer code,String remark){
		this.code = code;
		this.remark = remark;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}
}
