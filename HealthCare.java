package com.mycom.dept;

import com.mycom.Finance.Finance;

public class HealthCare implements Finance {
public String Id;
public String VetName;
public String Speciality;

public void checkHealth(String speciality) {
	this.Speciality  = speciality;
	
	System.out.println("health is OK");
	SubmitReports();
}

public void giveTreatment() {
	
	System.out.println("Treatment given Specimen is getting healed");
	getFunds();
}

private void SubmitReports() {
	//code to submit the report
}

private void getFunds() {
	Finance.getFunds();
}

}
