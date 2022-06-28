package com.mycom.dept;

import com.mycom.Finance.Finance;

public class Sanitation implements Finance {
public String Id ;
public String name;
String Supervisor;

public void cleanCages() {
	System.out.println("cages cleaned");
}

public void cleanAlleyWays() {
	System.out.println("alleyways cleaned");
}
}
