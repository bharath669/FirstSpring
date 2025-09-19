package com.example.FirstSpring;

public class HelloResponse {
    private String message;
    private String message1;

    public HelloResponse(String message,String message1) {
        this.message = message;
        this.message1=message1;
    }

    public String getMessage() {
        return message;
    }
    public String getMessage1() {
        return message1;
    }

//    public void setMessage(String message) {
//        this.message = message;
//    }
}
