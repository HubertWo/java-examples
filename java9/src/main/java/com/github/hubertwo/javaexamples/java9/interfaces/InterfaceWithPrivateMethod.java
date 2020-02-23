package com.github.hubertwo.javaexamples.java9.interfaces;

public interface InterfaceWithPrivateMethod {

    /**
     * Default method that might be overridden by class that implements this interface.
     */
    default String getMessage(String name) {
        return buildMessage(name);
    }

    /**
     * Static method of interface.
     */
    static String getStaticMessage(String name) {
        String message = "Hello %s! Static method does not have access to private interface methods.";
        return String.format(message, name);
    }

    /**
     * Private method.
     */
    private String buildMessage(String name) {
        String message = "Hello %s! This message comes from private method of %s";
        return String.format(message, name, InterfaceWithPrivateMethod.class.getName());
    }
}
