package com.renho.jdk8.lambda;

@FunctionalInterface
public interface FunctionalDefaultMethods {
	
    void method();
    default void defaultMethod() {
    	System.out.println("defaultMethod");
    }
}
