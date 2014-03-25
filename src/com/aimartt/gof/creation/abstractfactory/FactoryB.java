/**
 * 
 */
package com.aimartt.gof.creation.abstractfactory;

/**
 * @author aimartt
 *
 */
public class FactoryB implements AbstractFactory {

	@Override
	public AbstractProduct createProduct(String name) {
		return new ProductB(name);
	}

}