package net.dinomite.guice.throwing_provider;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.google.inject.Singleton;

class ThrowingProviderModule extends AbstractModule {
    @Provides
    @Singleton
    String providesString() {
        throw new RuntimeException();
    }
}
