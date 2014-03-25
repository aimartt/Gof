/**
 * 
 */
package com.aimartt.gof.creation.abstractfactory;

/**
 * @author aimartt
 * @date 2014-03-25
 */
public abstract class AbstractProduct {
	
	protected String name;
	
	@Override
	public String toString() {
		return this.name;
	}

}