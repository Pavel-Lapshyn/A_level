package ua.lapshyn.hw12;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Task2 {
    public static void main(String[] args) {
        f();
    }

    public static void f() {
        try {
            g();
        } catch (IOException exception) {
            try {
                throw new RuntimeException("second exception");
            } catch (RuntimeException e) {
                e.printStackTrace();
            }
        }
    }

    public static boolean g() throws IOException {
        throw new IOException("first exception");
    }
}