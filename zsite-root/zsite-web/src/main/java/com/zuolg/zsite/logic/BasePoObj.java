package com.zuolg.zsite.logic;

/**
 * <pre>
 * 基础的逻辑层，其实就是有个po而已
 * </pre>
 * 
 * @author 梁韦江
 * @date 2016年6月17日
 */
public class BasePoObj<T> {

	private final T po;

	public BasePoObj(T po) {
		super();
		this.po = po;
	}

	public T getPo() {
		return po;
	}

}
