package com.guo.pojo.vo;

import java.io.Serializable;

/**
 * 类描述：
 *
 * @ClassName CellphoneVo
 * @Description TODO
 * @Author 郭佳
 * @Date 2021/2/4 20:46
 * @Version 1.0
 */
public class CellphoneVo implements Serializable {
	private static final long serialVersionUID = 7179088103164405991L;
	private String cellphone;
	private Long id;

	public String getCellphone() {
		return cellphone;
	}

	public void setCellphone(String cellphone) {
		this.cellphone = cellphone;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
}