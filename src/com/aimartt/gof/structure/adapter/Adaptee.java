/**
 * 
 */
package com.aimartt.gof.structure.adapter;

/**
 * @author aimartt
 * @date 2014-03-24
 */
public class Adaptee {
	
	public void methodA() {
		System.out.println(this.getClass().getName() + "_methodA");
	} 
	
	public void methodB() {
		System.out.println(this.getClass().getName() + "_methodB");
	} 

}