/**
 * 
 */
package com.aimartt.gof.creation.abstractfactory;

/**
 * @author aimartt
 * @date 2014-03-25
 */
public class FactoryA implements AbstractFactory {

	@Override
	public AbstractProduct createProduct(String name) {
		return new ProductA(name);
	}

}