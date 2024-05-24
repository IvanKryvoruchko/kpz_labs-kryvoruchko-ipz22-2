package org.example.lab2.singleton;

import java.util.Random;

public final class Authenticator {
    private final int authId = new Random().nextInt();

    private Authenticator() {
    }

    public static Authenticator getInstance() {
        return AuthenticatorSingletonHolder.instance;
    }

    public void printInfo() {
        System.out.println("Identification: " + authId);
    }

    private static class AuthenticatorSingletonHolder {
        public static final Authenticator instance = new Authenticator();
    }
}
