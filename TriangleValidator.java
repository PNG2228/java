package com.pg;

public class TriangleValidator {
 public boolean isValidTriangle(int angle1,int angle2, int angle3) {
	 if(angle1<=0||angle2<=0||angle3<=0) {
		 return false;
	 }
	 int sumOfAngles=angle1+angle2+angle3;
	 return sumOfAngles==180;
 }
}
