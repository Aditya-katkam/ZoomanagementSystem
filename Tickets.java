package com.mycom.dept;

import java.util.Date;

import com.mycom.Finance.Finance;


public class Tickets implements Finance {
public String visitorName;
public String ticketId;
Date enterTime;
Date exitTime;
String ticketType;

public void giveTicket() {
	//code to give ticket;
}

private void giveFunds() {
	// codetogivefunds
	Finance.realeseFunds();
}

}
