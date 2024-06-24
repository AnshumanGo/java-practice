package com.practice.java._23lambdaexpressionsandstreams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class _3OrderLambdaStream {
	private int id;
	private String productName;
	private String productType;
	private String productSubType;
	private String productManufacturer;
	private String productSupplier;
	private float quantity;
	private float quantityUnitPrice;
    public _3OrderLambdaStream(int id, String productName, String productType, String productSubType, String productManufacturer, String productSupplier, float quantity, float quantityUnitPrice) {  
        this.id = id;
        this.productName = productName;
        this.productType = productType;
        this.productSubType = productSubType;
        this.productManufacturer = productManufacturer;
        this.productSupplier = productSupplier;
        this.quantity = quantity;
        this.quantityUnitPrice = quantityUnitPrice;
    }
    public static void main(String[] args) {
		List<_3OrderLambdaStream> order = new ArrayList<_3OrderLambdaStream>();
		order.add(new _3OrderLambdaStream(1, "HP Omen 16 Laptop 16000xz", "Electronics", "Laptop", "HP", "SalesHigh", 1f, 181000f));
		order.add(new _3OrderLambdaStream(2, "Asus ROG 16 Laptop RE5848R", "Electronics", "Laptop", "Asus", "SalesHigh", 1f, 178000f));
		order.add(new _3OrderLambdaStream(3, "HP Victus 16 Laptop 15ea00tx", "Electronics", "Laptop", "HP", "LapSales", 1f, 140000f));
		order.add(new _3OrderLambdaStream(4, "Symphony 80i desert cooler", "Electronics", "Cooler", "Symphony", "ElectroWorld", 1f, 12700f));
		order.add(new _3OrderLambdaStream(5, "Samsung M53 5G mobile", "Electronics", "Mobile", "Samsung", "MobileCom", 1f, 21000f));
		order.add(new _3OrderLambdaStream(6, "Potato Ooty Organic", "Food Item", "Potato", "Generic", "DesiFood", 2.5f, 43f));
		order.add(new _3OrderLambdaStream(7, "Onion Sambhar", "Food Item", "Onion", "Generic", "OrganicHigh", 1.6f, 63f));
		order.add(new _3OrderLambdaStream(7, "Haldiram Navratan Mixture", "Food Item", "Desi Snacks", "Haldiram", "TastyFoods", 1.6f, 63f));
		
		List<Float>  individualItemQuantity = order.stream().map(x->x.quantity)
        .collect(Collectors.toList());
		
		System.out.println("total amount for inidividual items are : "+ individualItemQuantity);
		
		List<Float>  totalAmount = order.stream().map(x->x.quantity*x.quantityUnitPrice)
        .collect(Collectors.toList());
		
		System.out.println("total amount for inidividual items are : "+ totalAmount);
		
		Long totalItems = order.stream()
        .collect(Collectors.counting());
		
		System.out.println("Total items are : "+ totalItems);
		
		Double totalItemsQuantity = order.stream().collect(Collectors.summingDouble(x->x.quantity));
		
		System.out.println("Total items total quanity is : "+ totalItemsQuantity);
		
		Double finalTotalAmount = order.stream()  
        .collect(Collectors.summingDouble(x->x.quantity*x.quantityUnitPrice));
		
		System.out.println("Final total amount that needs to be paid is : "+ finalTotalAmount);
		
		Float finalTotalAmountAlternativeCalculation = order.stream()  
	                .map(x->x.quantity*x.quantityUnitPrice)  
	                .reduce(0.0f,Float::sum);   // accumulating price, by referring method of Float class  
	    System.out.println("Final total amount (alternative calculation) that needs to be paid is : "+ finalTotalAmountAlternativeCalculation);
	         
        _3OrderLambdaStream maxUnitItem = order.stream().max((itemOne, itemTwo)->itemOne.quantity > itemTwo.quantity ? 1: -1).get();
        System.out.println("Maximum quantity item details is : Name "+maxUnitItem.productName+", its quantity: "+maxUnitItem.quantity+", its unit price : "+maxUnitItem.quantityUnitPrice+" and item's total price for quantity : "+(maxUnitItem.quantity*maxUnitItem.quantityUnitPrice));
        
   _3OrderLambdaStream minUnitItem = order.stream().min((itemOne, itemTwo)->itemOne.quantity > itemTwo.quantity ? 1: -1).get();
   System.out.println("Minimum quantity item details is : Name "+minUnitItem.productName+", its quantity: "+minUnitItem.quantity+", its unit price : "+minUnitItem.quantityUnitPrice+" and item's total price for quantity : "+(minUnitItem.quantity*minUnitItem.quantityUnitPrice));

_3OrderLambdaStream maxUnitPriceItem = order.stream().max((itemOne, itemTwo)->itemOne.quantityUnitPrice > itemTwo.quantityUnitPrice ? 1: -1).get();
System.out.println("Maximum quantity item details is : Name "+maxUnitPriceItem.productName+", its quantity: "+maxUnitPriceItem.quantity+", its unit price : "+maxUnitPriceItem.quantityUnitPrice+" and item's total price for quantity : "+(maxUnitPriceItem.quantity*maxUnitPriceItem.quantityUnitPrice));

_3OrderLambdaStream minUnitPriceItem = order.stream().min((itemOne, itemTwo)->itemOne.quantityUnitPrice > itemTwo.quantityUnitPrice ? 1: -1).get();
System.out.println("Minimum quantity item details is : Name "+minUnitPriceItem.productName+", its quantity: "+minUnitPriceItem.quantity+", its unit price : "+minUnitPriceItem.quantityUnitPrice+" and item's total price for quantity : "+(minUnitPriceItem.quantity*minUnitPriceItem.quantityUnitPrice));

_3OrderLambdaStream maxTotalPriceItem = order.stream().max((itemOne, itemTwo)->(itemOne.quantity*itemOne.quantityUnitPrice) > (itemTwo.quantity*itemTwo.quantityUnitPrice) ? 1: -1).get();
System.out.println("Maximum quantity item details is : Name "+maxTotalPriceItem.productName+", its quantity: "+maxTotalPriceItem.quantity+", its unit price : "+maxTotalPriceItem.quantityUnitPrice+" and item's total price for quantity : "+(maxTotalPriceItem.quantity*maxTotalPriceItem.quantityUnitPrice));

_3OrderLambdaStream minTotalPriceItem = order.stream().min((itemOne, itemTwo)->(itemOne.quantity*itemOne.quantityUnitPrice) > (itemTwo.quantity*itemTwo.quantityUnitPrice) ? 1: -1).get();
System.out.println("Minimum quantity item details is : Name "+minTotalPriceItem.productName+", its quantity: "+minTotalPriceItem.quantity+", its unit price : "+minTotalPriceItem.quantityUnitPrice+" and item's total price for quantity : "+(minTotalPriceItem.quantity*minTotalPriceItem.quantityUnitPrice));
	}
}
