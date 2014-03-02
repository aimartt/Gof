/**
 * 
 */
package com.aimartt.gof.behavior.visitor;

/**
 * @author aimartt
 * @date 2014-03-02
 */
public abstract class Visitor {
	
	public abstract void visitConcreteElementA(ConcreteElementA elementA);
	
	public abstract void visitConcreteElementB(ConcreteElementB elementB);

}