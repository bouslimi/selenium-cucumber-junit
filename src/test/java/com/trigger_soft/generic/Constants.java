package com.trigger_soft.generic;

import java.time.Duration;


public class Constants {
    // Web driver
    public static final long IMPLICIT_TIMEOUT = 0;      // 0 ms to avoid timeouts caused by multiple implicit waits
    public static final Duration EXPLICIT_TIMEOUT = Duration.ofSeconds(30);     // in milliseconds
}
