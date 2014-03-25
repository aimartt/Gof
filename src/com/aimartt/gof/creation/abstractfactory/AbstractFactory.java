/**
 * 
 */
package com.aimartt.gof.creation.abstractfactory;

/**
 * @author aimartt
 * @date 2014-03-25
 */
public interface AbstractFactory {

	AbstractProduct createProduct(String name);
	
}