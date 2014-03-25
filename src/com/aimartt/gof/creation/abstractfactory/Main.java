/**
 * 
 */
package com.aimartt.gof.creation.abstractfactory;

/**
 * @author aimartt
 * @date 2014-03-25
 */
public class Main {

	public static void main(String[] args) {
		AbstractFactory factory = new FactoryA();
		AbstractProduct product = factory.createProduct("product_a");
		System.out.println(product);
		factory = new FactoryB();
		product = factory.createProduct("product_b");
		System.out.println(product);
	}

}