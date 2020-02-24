package com.github.hubertwo.javaexamples.java9.trywithresources;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;

import static org.mockito.Mockito.*;

class TryWithResourcesTest {

    @Test
    @DisplayName("Pass effectively final variable to try-with-resources")
    void passVariableToTryWithResources() throws Exception {
        final int expectedNumberOfCloseCalls = 1;
        final ByteArrayInputStream byteArrayInputStreamSpy = spy(new ByteArrayInputStream("Hello ".getBytes()));

        verifyNoInteractions(byteArrayInputStreamSpy);

        // This will not work in Java < 9
        try (byteArrayInputStreamSpy) {
            // Do nothing
        }

        verify(byteArrayInputStreamSpy, times(expectedNumberOfCloseCalls)).close();
    }

}
