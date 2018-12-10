package com.multiplecontrol;



public class DemoAmazonproject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
    AmazonProject ap = new AmazonProject();
		
		ap.invokeBrowser("chrome");
		
		System.out.println(ap.getTextFromLink());
		
		System.out.println(ap.getCountOfLinks());
		
		ap.printAllLinks();


	}

}
