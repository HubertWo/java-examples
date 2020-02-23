package com.github.hubertwo.javaexamples.java9.interfaces;

public interface InterfaceThatExtendsOtherInterface extends InterfaceWithPrivateMethod {

    /**
     * Overriding the method from {@link InterfaceWithPrivateMethod}.
     */
    @Override
    default String getMessage(String name) {
        return "Message from overridden default method. " + InterfaceWithPrivateMethod.super.getMessage(name);
    }
}
