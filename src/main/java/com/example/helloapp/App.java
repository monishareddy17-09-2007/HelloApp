package com.example.helloapp;
import java.util.*;
/**
 * Hello world!
 */
    	public class App {
    	    public static void main(String[] args) {
    	        
    	        // Check if user provided a name as command-line argument
    	        if (args.length > 0) {
    	            // Get the name from command-line argument
    	            String name = args[0];
    	            
    	            // Display personalized greeting
    	            System.out.println("Hello, " + name);
    	        } else {
    	            // No argument provided, display default
    	            System.out.println("Hello World");
    	        }
    	        
    	    }
    
    }

