/**
 * 
 */
package com.aimartt.gof.behavior.template;

/**
 * @author aimartt
 * @date 2014-02-25
 */
public abstract class AbstractClass {
	
	//���󷽷���������ʵ��
	
	public abstract void absMethod1();
	public abstract void absMethod2();
	
	/**
	 * ģ�巽�����涨�߼���ܣ�����ʵ�����������
	 */
	public void templateMethod() {
		absMethod1();
		absMethod2();
	}
	
}