/*
 * generated by Xtext 2.25.0
 */
package org.xtext.example.mydsl.validation;

import org.eclipse.xtext.validation.Check;
import org.xtext.example.mydsl.myDsl.Entity;

/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
public class MyDslValidator extends AbstractMyDslValidator {
	
//	public static final String INVALID_NAME = "invalidName";
//
//	@Check
//	public void checkGreetingStartsWithCapital(Greeting greeting) {
//		if (!Character.isUpperCase(greeting.getName().charAt(0))) {
//			warning("Name should start with a capital",
//					MyDslPackage.Literals.GREETING__NAME,
//					INVALID_NAME);
//		}
//	}
	
	@Check
	public void soSomethingWithTheExtends(Entity e) {
		while (e != null) {
			System.out.println(e.getName());
			e = e.getExtends();
		}
	}
	
}
