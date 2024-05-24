package org.example.lab2.singleton;

import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Authenticator> authenticators = List.of(Authenticator.getInstance(), Authenticator.getInstance());
        for (Authenticator authenticator : authenticators) {
            authenticator.printInfo();
        }
    }
}
