package com.github.hubertwo.javaexamples.java9.processhandle;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ProcessHandleTest {

    @Test
    @DisplayName("New java.lang.ProcessHandle class")
    public void getCurrentProcessHandle() {
        ProcessHandle currentProcessHandle = ProcessHandle.current();
        assertThat(currentProcessHandle.isAlive());
        assertThat(currentProcessHandle.pid()).isGreaterThan(0);
    }
}
