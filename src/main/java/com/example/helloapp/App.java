package com.example.helloapp;

public class App {
    public static void main(String[] args) {
        
        
        if (args.length > 0) {
            
            for (int i = 0; i < args.length; i++) {
                String name = args[i];
                System.out.println("Hello " + name);
            }
        } else {
            
            String defaultName = "World";
            System.out.println("Hello " + defaultName);
        }
        
    }
}