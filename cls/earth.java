package com.touhe.cls;

public class earth {
	
public static void main(String[]args) {
	human lee;
	human mahab;
	
	lee = new human();
	mahab = new human();
	
	lee.name = "lee wen";
	lee.age =  5;
	lee.gender = "male";
	lee.nationality = "chinese";
	lee.workplace = "custom house";
	
	mahab.name = "Mahab khan";
	mahab.age = 3;
	mahab.gender = "male";
	mahab.nationality = "pakistani";
	mahab.workplace = "Amazon";
	
	
	mahab.speak();
	lee.speak();
	
}
}
