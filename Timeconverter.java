package com.pg;

public class Timeconverter {
public static int convertHoursToMinutes(int hours) {
	if(hours<0) {
		return -1;
	}
	int noOfMinutes=hours*60;
	return noOfMinutes;
}
public static int convertDaysToMinutes(int days) {
	if(days<0) {
		return -1;
	}
int noOfMinutes=days*24*60;
return noOfMinutes;
}
}