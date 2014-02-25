/**
 * 
 */
package com.aimartt.gof.behavior.template;

/**
 * @author aimatt
 *
 */
public class Main {

	public static void main(String[] args) {
		AbstractClass ac = new ConcreteClassA();
		ac.templateMethod();
		ac = new ConcreteClassB();
		ac.templateMethod();
	}

}