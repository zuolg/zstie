package com.zuolg.zsite.api.forms;

import com.zuolg.commons.annotation.api.AForm;

/**
 * <pre>
 * 只有一个id的form
 * </pre>
 * 
 * @author 梁韦江
 * @date 2016年6月24日
 */
@AForm
public class IdForm {

	/**
	 * ID
	 */
	private int id;
	
	public IdForm(){
		
	}
	
	public IdForm(int id){
		this.id=id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
