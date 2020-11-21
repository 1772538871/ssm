package com.javen.util;

import java.util.ArrayList;
import java.util.List;

public class PageAssitant<T> {
	private Integer count = 0;
	private Integer totalPage = 0;
	private Integer pageSize = 9;
	private Integer currPage = 1;
	private Integer currStart = 0;
	private Integer pageNum = 1;
	
	List<T> items = new ArrayList<T>();
	
	public PageAssitant() {
	}

	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
		setTotalPage();
	}
	
	public Integer getTotalPage() {
		return totalPage;
	}
	
	private void setTotalPage() {
		totalPage = count / pageSize;
		if(count % pageSize != 0){
			totalPage++;
		}
	}
	
	public Integer getPageSize() {
		return pageSize;
	}
	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		setTotalPage();
		setCurrStart();
	}
	

	public Integer getCurrPage() {
		return currPage;
	}


	public void setCurrPage(Integer currPage) {
		this.currPage = currPage;
		setCurrStart();
	}
	

	public Integer getCurrStart() {
		return currStart;
	}

	private void setCurrStart() {
		currStart = (currPage - 1) * pageSize;
	}


	public List<T> getItems(){
		return items;
	}

	public void setItems(List<T> items) {
		this.items = items;
	}
}
