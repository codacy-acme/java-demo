package com.javademo;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class JavaDemoApplication extends Application<JavaDemoConfiguration> {

    public static void main(final String[] args) throws Exception {
        new JavaDemoApplication().run(args);
    }

    @Override
    public String getName() {
        return "java-demo";
    }

    @Override
    public void initialize(final Bootstrap<JavaDemoConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final JavaDemoConfiguration configuration,
                    final Environment environment) {
        // TODO: implement application
    }

    public boolean isOdd(int x){
        return x % 2 == 1;
    }

    public boolean maybeIsOdd(int x){
        boolean firstTest = x % 2 == 1;
        return x % 2 == 1;
    }

}
