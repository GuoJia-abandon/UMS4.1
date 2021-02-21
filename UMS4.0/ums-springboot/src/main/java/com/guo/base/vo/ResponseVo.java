package com.guo.base.vo;

import com.guo.base.enums.RespCodeEnums;

import java.io.Serializable;

public class ResponseVo<E> implements Serializable {
	private static final long serialVersionUID = 6391067806139370417L;
	private Integer code;
	private E data;

	private ResponseVo(){}

	private ResponseVo(Integer code,E data){
		this.code = code;
		this.data = data;
	}

	private ResponseVo(Integer code){
		this.code = code;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public E getData() {
		return data;
	}

	public void setData(E data) {
		this.data = data;
	}

	/*
	 * <b>系统响应成功</b>
	 */
	public static ResponseVo getSuccessResponseVo() throws Exception{
		return new ResponseVo(RespCodeEnums.RESP_CODE_SUCCESS.getCode());
	}

	/*
	 * <b>系统响应成功</b>
	 */
	public static ResponseVo getSuccessResponseVo(Object data) throws Exception{
		return new ResponseVo(RespCodeEnums.RESP_CODE_SUCCESS.getCode(),data);
	}

	/*
	 * <b>系统响应异常</b>
	 */
	public static ResponseVo getExceptionResponseVo(Object data) throws Exception{
		return new ResponseVo(RespCodeEnums.RESP_CODE_EXCEPTION.getCode(),data);
	}

	/*
	 * <b>系统响应错误</b>
	 */
	public static ResponseVo getErrorResponseVo(Object data) throws Exception{
		return new ResponseVo(RespCodeEnums.RESP_CODE_ERROR.getCode(),data);
	}
}
