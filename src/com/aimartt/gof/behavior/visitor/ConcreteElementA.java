/**
 * 
 */
package com.aimartt.gof.behavior.visitor;

/**
 * @author aimartt
 * @date 2014-03-02
 */
public class ConcreteElementA extends Element {

	@Override
	public void accept(Visitor visitor) {
		visitor.visitConcreteElementA(this);
	}

} 