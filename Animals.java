package com.mycom.animals;

import com.mycom.Food;

public class Animals implements Food{
int id ;
public String Name ;
public String Kingdom;


protected void eatFood() {
	Food.feed();
	
	System.out.println("Animal eating");
	
}
protected void sleep() {
	System.out.println("Animal sleeping");
}
}
