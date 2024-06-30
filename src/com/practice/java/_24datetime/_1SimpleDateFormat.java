package com.practice.java._24datetime;

import java.text.SimpleDateFormat;
import java.util.Date;

public class _1SimpleDateFormat {

public static void main(String[] args) {
	Date date = new Date();
	System.out.println("Date : "+date);

	SimpleDateFormat dateFormat = new SimpleDateFormat("E, dd MMM yyyy HH:mm:ss z");
	String dateValue = dateFormat.format(date);
	System.out.println("Date Format with E, dd MMM yyyy HH:mm:ss z : "+dateValue);

	dateFormat = new SimpleDateFormat("dd MMMM yyyy zzzz");
	dateValue = dateFormat.format(date);
	System.out.println("Date Format with dd MMMM yyyy zzzz : "+dateValue);

	dateFormat = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
	dateValue = dateFormat.format(date);
	System.out.println("Date Format with dd-M-yyyy hh:mm:ss : "+dateValue);

	dateFormat = new SimpleDateFormat("dd MMMM yyyy");
	dateValue = dateFormat.format(date);
	System.out.println("Date Format with dd MMMM yyyy : "+dateValue);
	
	dateFormat = new SimpleDateFormat("MM/dd/yyyy");
    dateValue = dateFormat.format(date);
	System.out.println("Date Format with MM/dd/yyyy : "+dateValue);
}
}
