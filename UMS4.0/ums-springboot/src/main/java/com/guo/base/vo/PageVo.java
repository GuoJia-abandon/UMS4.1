package com.guo.base.vo;

import com.guo.util.ConstantUtil;

import java.io.Serializable;
import java.util.List;

/**
 * <b>分页信息</b>
 */
public class PageVo<E> implements Serializable {
	private static final long serialVersionUID = -9048623694423031469L;

	private Integer pageNum;          //当前页数
	private Integer pageSize;         //每页显示数量
	private Integer draw;
	private List<E> lists;            //分页集合列表
	private Long totalCount;          //总条数
	private Integer totalPage;        //总页数

	public PageVo(Integer pageNum,Integer pageSize){
		if (pageNum != null && pageNum > 0){
			this.pageNum = pageNum;
		} else {
			this.pageNum = ConstantUtil.PAGE_NUM;
		}

		if (pageSize != null && pageSize > 0){
			this.pageSize = pageSize;
		} else {
			this.pageSize = ConstantUtil.PAGE_SIZE;
		}
	}

	public Integer getPageNum() {
		return pageNum;
	}

	public void setPageNum(Integer pageNum) {
		this.pageNum = pageNum;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public List<E> getLists() {
		return lists;
	}

	public void setLists(List<E> lists) {
		this.lists = lists;
	}

	public Long getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

	public Integer getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(Integer totalPage) {
		this.totalPage = totalPage;
	}

	public Integer getDraw() {
		return draw;
	}

	public void setDraw(Integer draw) {
		this.draw = draw;
	}
}
