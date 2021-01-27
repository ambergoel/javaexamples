package io.agoel;

/*
 * Marking with @FunctionalInterface which is make sure developer can not add more then one method 
 * declaration here in interface. As this interface is created for Lambda expression.
 * This annotation is completely optional but good to have.
 */
@FunctionalInterface
public interface IGreeting {

	void perform();

}
