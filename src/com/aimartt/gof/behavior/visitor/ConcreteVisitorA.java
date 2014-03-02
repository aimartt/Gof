/**
 * 
 */
package com.aimartt.gof.behavior.visitor;


/**
 * @author aimartt
 * @date 2014-03-02
 */
public class ConcreteVisitorA extends Visitor {

	@Override
	public void visitConcreteElementA(ConcreteElementA elementA) {
		System.out.println("访问者A访问元素A");
	}

	@Override
	public void visitConcreteElementB(ConcreteElementB elementB) {
		System.out.println("访问者A访问元素B");
	}

}