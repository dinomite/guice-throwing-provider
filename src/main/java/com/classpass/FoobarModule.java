package com.classpass;

import com.google.inject.Binder;
import com.google.inject.Provides;
import com.hubspot.dropwizard.guicier.DropwizardAwareModule;

import javax.inject.Singleton;

public class FoobarModule extends DropwizardAwareModule<FoobarConfig> {
    @Override
    public void configure(Binder binder) {
    }

    @Provides
    @Singleton
    public String providesString() {
        throw new RuntimeException();
    }
}
