package com.github.hubertwo.javaexamples.java9.interfaces;

public interface InterfaceWithPrivateMethod {

    /**
     * Default method that might be overridden by class that implements this interface.
     */
    default String getMessage(String name) {
        return buildMessage(name);
    }

    /**
     * Private method.s
     */
    private String buildMessage(String name) {
        String message = "Hello %s! This message comes from private method of %s";
        return String.format(message, name, InterfaceWithPrivateMethod.class.getName());
    }
}
