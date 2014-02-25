/**
 * 
 */
package com.aimartt.gof.behavior.template;

/**
 * @author aimartt
 * @date 2014-02-25
 */
public abstract class AbstractClass {
	
	//抽象方法，由子类实现
	
	public abstract void absMethod1();
	public abstract void absMethod2();
	
	/**
	 * 模板方法，规定逻辑框架，具体实现由子类完成
	 */
	public void templateMethod() {
		absMethod1();
		absMethod2();
	}
	
}