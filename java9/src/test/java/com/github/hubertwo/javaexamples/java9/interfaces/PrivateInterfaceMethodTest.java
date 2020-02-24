package com.github.hubertwo.javaexamples.java9.interfaces;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class PrivateInterfaceMethodTest {

    @Test
    @DisplayName("Use private method of interface")
    void getMessageFromPrivateInterfaceMethod() {
        final String givenName = "Hubert";
        final String expectedMessage = "Hello Hubert! This message comes from private method of com.github.hubertwo.javaexamples.java9.interfaces.InterfaceWithPrivateMethod";

        InterfaceWithPrivateMethod interfaceWithPrivateMethod = new InterfaceWithPrivateMethodImpl();

        final String actualMessage = interfaceWithPrivateMethod.getMessage(givenName);

        assertThat(actualMessage)
                .isEqualTo(expectedMessage);
    }

    @Test
    @DisplayName("Override default method of an interface")
    void overrideInterfaceDefaultMethod() {
        final String givenName = "Patrycja";
        final String expectedMessage = "Message from overridden default method. Hello Patrycja! This message comes from private method of com.github.hubertwo.javaexamples.java9.interfaces.InterfaceWithPrivateMethod";

        // Creating anonymous class for readability.
        InterfaceThatExtendsOtherInterface interfaceThatExtendsOtherInterface = new InterfaceThatExtendsOtherInterface() {
            // Anonymous class.
        };

        final String actualMessage = interfaceThatExtendsOtherInterface.getMessage(givenName);

        assertThat(actualMessage)
                .isEqualTo(expectedMessage);
    }

    @Test
    @DisplayName("Calling interface static method")
    void staticMethod() {
        final String givenName = "Anna";
        final String expectedMessage = "Hello Anna! Static method does not have access to private interface methods.";

        final String actualMessage = InterfaceWithPrivateMethod.getStaticMessage(givenName);

        assertThat(actualMessage)
                .isEqualTo(expectedMessage);
    }

}