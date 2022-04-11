package org.ram.examples;

public class ClassWithPrivateMethods {

    private String privateShowMessage(String message){
        return message;
    }
    public String callPrivateShowMessage(String message){
        return privateShowMessage(message);
    }
}

