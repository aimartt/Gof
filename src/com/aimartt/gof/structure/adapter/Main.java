/**
 * 
 */
package com.aimartt.gof.structure.adapter;

/**
 * @author aimartt
 * @date 2014-03-24
 */
public class Main {
	
	public static void main(String[] args) {
		Target target = new Adapter();
		target.method1();
		target.method2();
	}
	
}