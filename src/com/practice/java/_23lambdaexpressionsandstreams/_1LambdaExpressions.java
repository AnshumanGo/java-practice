package com.practice.java._23lambdaexpressionsandstreams;

interface Vehicle{
	public void vehicleType();
}

public class _1LambdaExpressions {	 
    public static void main(String[] args) {  
        String vehicleTypeValue = "Two Wheeler";  
          
        //with lambda  
        Vehicle v = ()->{  
            System.out.println("Vehicle Type is : "+vehicleTypeValue);
        };  
        v.vehicleType();  
    }  
}
