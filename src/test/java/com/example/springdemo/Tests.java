package com.example.springdemo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Tests {

    @Test
    void testLength() {
        var args = new String[]{"one"};
        var obj = switch (args.length) {
            case 0 -> null;
            case 1 -> "1";
            default -> "default";
        };

        Assertions.assertEquals("1", obj);

    }
}
