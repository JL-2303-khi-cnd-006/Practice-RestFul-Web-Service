package com.jave.pracdemo1;


public record Greeting(long id, String content) {

    public String text(){
        return "Hello World";
     }

}

