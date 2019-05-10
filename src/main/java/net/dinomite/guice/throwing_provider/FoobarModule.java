package net.dinomite.guice.throwing_provider;

import com.google.inject.Binder;
import com.google.inject.Provides;
import com.google.inject.Singleton;
import com.hubspot.dropwizard.guicier.DropwizardAwareModule;

class FoobarModule extends DropwizardAwareModule<FoobarConfig> {
    @Override
    public void configure(Binder binder) {
    }

    @Provides
    @Singleton
    String providesString() {
        throw new RuntimeException();
    }
}
