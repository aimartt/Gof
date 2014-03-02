/**
 * 
 */
package com.aimartt.gof.behavior.visitor;

/**
 * @author aimartt
 * @date 2014-03-02
 */
public abstract class Element {
	
	public abstract void accept(Visitor visitor);

}
