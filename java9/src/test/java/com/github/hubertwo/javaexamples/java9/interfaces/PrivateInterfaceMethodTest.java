package com.github.hubertwo.javaexamples.java9.interfaces;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PrivateInterfaceMethodTest {

    @Test
    public void getMessageFromPrivateInterfaceMethod() {
        final String givenName = "Hubert";
        final String expectedMessage = "Hello Hubert! This message comes from private method of com.github.hubertwo.javaexamples.java9.interfaces.InterfaceWithPrivateMethod";

        InterfaceWithPrivateMethod interfaceWithPrivateMethod = new InterfaceWithPrivateMethodImpl();

        String actualMessage = interfaceWithPrivateMethod.getMessage(givenName);

        assertThat(actualMessage)
                .isEqualTo(expectedMessage);
    }
}