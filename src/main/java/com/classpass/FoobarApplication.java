package com.classpass;

import com.hubspot.dropwizard.guicier.GuiceBundle;
import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class FoobarApplication extends Application<FoobarConfig> {
    public static void main(String[] args) throws Exception {
        FoobarApplication foobarApplication = new FoobarApplication();
        foobarApplication.run(args);
    }

    @Override
    public void initialize(Bootstrap<FoobarConfig> bootstrap) {
        GuiceBundle<FoobarConfig> guice = GuiceBundle
                .defaultBuilder(FoobarConfig.class)
                .enableGuiceEnforcer(false)
                .modules(new FoobarModule())
                .build();
        bootstrap.addBundle(guice);
    }

    @Override
    public void run(FoobarConfig configuration, Environment environment) throws Exception {
    }

    @Override
    public void run(String... args) throws Exception {
        super.run(args);
    }
}
