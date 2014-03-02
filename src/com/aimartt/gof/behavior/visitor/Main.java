/**
 * 
 */
package com.aimartt.gof.behavior.visitor;

/**
 * @author aimatt
 *
 */
public class Main {

	public static void main(String[] args) {
		Visitor visitorA = new ConcreteVisitorA();
		Visitor visitorB = new ConcreteVisitorB();
		Element elementA = new ConcreteElementA();
		Element elementB = new ConcreteElementB();
		elementA.accept(visitorA);
		elementB.accept(visitorA);
		elementA.accept(visitorB);
		elementB.accept(visitorB);
	}

}