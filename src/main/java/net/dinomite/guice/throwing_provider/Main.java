package net.dinomite.guice.throwing_provider;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Stage;

public class Main {
    public static void main(String[] args) {
        Injector injector = Guice.createInjector(Stage.PRODUCTION, new ThrowingProviderModule());

        System.out.println("Getting a string…");
        String string = injector.getInstance(String.class);
        System.out.println("Got " + string);
    }
}
