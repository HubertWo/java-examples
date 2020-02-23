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

        String actualMessage = interfaceWithPrivateMethod.getMessage(givenName);

        assertThat(actualMessage)
                .isEqualTo(expectedMessage);
    }

    @Test
    @DisplayName("Override default method of interface.")
    void overrideInterfaceDefaultMethod() {
        final String givenName = "Patrycja";
        final String expectedMessage = "Message from overridden default method. Hello Patrycja! This message comes from private method of com.github.hubertwo.javaexamples.java9.interfaces.InterfaceWithPrivateMethod";

        // Creating anonymous class for readability.
        InterfaceThatExtendsOtherInterface interfaceThatExtendsOtherInterface = new InterfaceThatExtendsOtherInterface() {
            // Anonymous class.
        };

        String actualMessage = interfaceThatExtendsOtherInterface.getMessage(givenName);

        assertThat(actualMessage)
                .isEqualTo(expectedMessage);
    }
}