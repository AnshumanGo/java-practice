package com.practice.java._23lambdaexpressionsandstreams;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class _4EatStreamCollect {
	private String foodItemName;
	private String foodItemType;
	private String foodItemSubType;
	private String foodItemManufacturer;
	private String foodItemSupplier;
	private float foodItemQuantity;
	private float foodItemUnitPrice;
	public String getFoodItemName() {
		return foodItemName;
	}

	public void setFoodItemName(String foodItemName) {
		this.foodItemName = foodItemName;
	}

	public String getFoodItemType() {
		return foodItemType;
	}

	public void setFoodItemType(String foodItemType) {
		this.foodItemType = foodItemType;
	}

	public String getFoodItemSubType() {
		return foodItemSubType;
	}

	public void setFoodItemSubType(String foodItemSubType) {
		this.foodItemSubType = foodItemSubType;
	}

	public String getFoodItemManufacturer() {
		return foodItemManufacturer;
	}

	public void setFoodItemManufacturer(String foodItemManufacturer) {
		this.foodItemManufacturer = foodItemManufacturer;
	}

	public String getFoodItemSupplier() {
		return foodItemSupplier;
	}

	public void setFoodItemSupplier(String foodItemSupplier) {
		this.foodItemSupplier = foodItemSupplier;
	}

	public float getFoodItemQuantity() {
		return foodItemQuantity;
	}

	public void setFoodItemQuantity(float foodItemQuantity) {
		this.foodItemQuantity = foodItemQuantity;
	}

	public float getFoodItemUnitPrice() {
		return foodItemUnitPrice;
	}

	public void setFoodItemUnitPrice(float foodItemUnitPrice) {
		this.foodItemUnitPrice = foodItemUnitPrice;
	}
	public _4EatStreamCollect(String foodItemName, String foodItemType, String foodItemSubType, String foodItemManufacturer, String foodItemSupplier, float foodItemQuantity, float foodItemUnitPrice) {  
	    this.foodItemName = foodItemName;
	    this.foodItemType = foodItemType;
	    this.foodItemSubType = foodItemSubType;
	    this.foodItemManufacturer = foodItemManufacturer;
	    this.foodItemSupplier = foodItemSupplier;
	    this.foodItemQuantity = foodItemQuantity;
	    this.foodItemUnitPrice = foodItemUnitPrice;
	}

	@Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result
                + ((foodItemName == null) ? 0 : foodItemName.hashCode());
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final _4EatStreamCollect other = (_4EatStreamCollect) obj;
        if (foodItemName == null) {
            if (other.foodItemName != null)
                return false;
        } else if (!foodItemName.equals(other.foodItemName))
            return false;
        return true;
    }
	
	public static void main(String[] args) {
		List<_4EatStreamCollect> foodOrder = new ArrayList<_4EatStreamCollect>();
		foodOrder.add(new _4EatStreamCollect("Paneer Hariyali Tikka", "Veg", "Paneer Base", "Local", "Local", 1f, 63f));
		foodOrder.add(new _4EatStreamCollect("Honey Chili Potato", "Veg", "Potato base", "Local", "Local", 1f, 43f));
		foodOrder.add(new _4EatStreamCollect("Paneer Hariyali Tikka", "Veg", "Paneer Base", "Local", "Local", 1f, 63f));
		foodOrder.add(new _4EatStreamCollect("Malai Kofta", "Veg", "Kofta milk based base", "Local", "Local", 1f, 63f));
		foodOrder.add(new _4EatStreamCollect("Daal Tadka", "Veg", "Daal base", "Local", "Local", 1f, 45f));
		foodOrder.add(new _4EatStreamCollect("Ghee phulka", "Veg", "Phulka roti", "Local", "Local", 1f, 10f));
		foodOrder.add(new _4EatStreamCollect("Veg Paneer Dum Biryani", "Veg", "Phulka roti", "Local", "Local", 1f, 110f));
		
		System.out.println("Number of different food items in food order : "+foodOrder.stream().distinct().count());
		
		_4EatStreamCollect firstVegFoodItemInList = foodOrder.stream().filter(item -> item.getFoodItemType().equalsIgnoreCase("veg")).findFirst().orElse(null);
		
		if(firstVegFoodItemInList) {
			System.out.println("First veg  item in order : "+firstVegFoodItemInList);
		} else {
			System.out.println("No veg ordered");
		}
		}
}