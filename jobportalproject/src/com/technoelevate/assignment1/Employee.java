package com.technoelevate.assignment1;


public class Employee {
String name;
int yearOfPassOut;
double percentage;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getYearOfPassOut() {
	return yearOfPassOut;
}
public void setYearOfPassOut(int yearOfPassOut) {
	this.yearOfPassOut = yearOfPassOut;
}
public double getPercentage() {
	return percentage;
}
public void setPercentage(double percentage) {
	this.percentage = percentage;
}
@Override
public String toString() {
	return "name=" + name + ", yearOfPassOut=" + yearOfPassOut + ", percentage=" + percentage + "\n";
}

}
