/**
 * 
 */
package com.aimartt.gof.structure.adapter;

/**
 * @author aimartt
 * @date 2014-03-24
 */
public class Adapter implements Target {
	
	private Adaptee adaptee = new Adaptee();

	@Override
	public void method1() {
		adaptee.methodA();
	}

	@Override
	public void method2() {
		adaptee.methodB();
	}

}