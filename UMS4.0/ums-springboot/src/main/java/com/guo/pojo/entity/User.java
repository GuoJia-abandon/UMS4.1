package com.guo.pojo.entity;

import java.util.Date;

/**
 * @program: ums3.1
 * @description: 用户实体类
 * @author: Mr.guo
 * @create: 2021-01-09 10:49
 **/
public class User {
	private static final long serialVersionUID = 2102836922344751611L;

	private Long id;                        // 主键
	private String name;                    // 姓名
	private String cellphone;               // 手机号码
	private String password;                // 登录密码：MD5加密
	private Integer gender;                 // 性别：0-女性，1-男性
	private String idCard;                  // 身份证号码
	private String email;                   // 电子邮件
	private String avatar;                  // 头像
	private Integer status;                 // 系统状态：0-禁用，1-启用
	private Date createTime;                // 创建时间
	private Date updateTime;                // 修改时间

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCellphone() {
		return cellphone;
	}

	public void setCellphone(String cellphone) {
		this.cellphone = cellphone;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getGender() {
		return gender;
	}

	public void setGender(Integer gender) {
		this.gender = gender;
	}

	public String getIdCard() {
		return idCard;
	}

	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	@Override
	public String toString() {
		return "User{" +
				"id=" + id +
				", name='" + name + '\'' +
				", cellphone='" + cellphone + '\'' +
				", password='" + password + '\'' +
				", gender=" + gender +
				", idCard='" + idCard + '\'' +
				", email='" + email + '\'' +
				", avatar='" + avatar + '\'' +
				", status=" + status +
				", createTime=" + createTime +
				", updateTime=" + updateTime +
				'}';
	}
}


