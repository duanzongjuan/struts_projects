package com.juan.struts.bbs.action;

import java.util.List;

import com.juan.struts.bbs.model.Category;
import com.opensymphony.xwork2.ActionSupport;

public class CategoryAction extends ActionSupport{
	/**
	 * 
	 */
	private static final long serialVersionUID = -4672435917098794007L;
	
	private List<Category> categories;
	public String list() {
		
		return SUCCESS;
	}
	
	public String add() {
		return SUCCESS;
	}
	
	public String delete() {
		return SUCCESS;
	}
	
	public String update() {
		return SUCCESS;
	}
	
	public String addInput() {
		return INPUT;
	}
	
	public String updateInput() {
		return INPUT;
	}
}
