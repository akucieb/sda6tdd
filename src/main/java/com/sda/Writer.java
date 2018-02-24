package com.sda;

public class Writer {
    public String sayHello(String name) {
        String nameInMessage = name;
        if ("".equals(nameInMessage) || nameInMessage == null) {
            nameInMessage = "my friend";
        }
        return "Hello, " + nameInMessage + "!";

        //nazwa firmy/organizacji
        //nazwa konkretnego

        //lepiej mieć jedno wyjście z metody, bo łątwiej debugować, plus return w ifie to duplikacja kodu, bo "Hello !" już jest

    }


}
