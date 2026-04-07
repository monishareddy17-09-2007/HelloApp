package com.example.helloapp;


    	public class App {
    	    public static void main(String[] args) {

    	        // If no arguments → default
    	        if (args.length == 0) {
    	            System.out.println("Hello World");
    	        } else {
    	            // Loop through all names
    	            for (String name : args) {
    	                System.out.println("Hello " + name);
    	            }
    	        }
    	    }
    	}