package io.readers.bytes;

import java.io.PrintStream;

public class Example3 {
    public static void main(String[] args) {
        try (PrintStream printStream = new PrintStream(System.out)) {
            printStream.printf("Hello World!\n");
        }
    }
}
