package com.javademo.resources;


import com.google.common.base.Optional;



import org.junit.*;
import static org.assertj.core.api.Assertions.assertThat;

public class HelloWorld20195603085618Test {
    private HelloWorld20195603085618 resource;

    public void setup() {
        System.out.println("YAY");
    }


    public void testDumb() {
        resource = new HelloWorld20195603085618("Hello, %s", "Stranger");
        Optional<String> empty = Optional.absent();
        Optional<Integer> emptyInteger = Optional.absent();
        resource.sayHello(empty);
        resource.TestSQLInjection(emptyInteger,empty);
    }

    @Test
    public void testAdd() {
        resource = new HelloWorld20195603085618("Hello, %s", "Stranger");

        double result = resource.add(7,9);
        //assertThat("y").isEqualTo("y");
        assertThat(result).isEqualTo((double) 7+9);
    }



}