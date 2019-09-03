package com.corejava.java8;

public class DefaultMethodsJava8 {

	public static void main(String[] args) {

     // Payment payment=new Paytm(); //UpCasting
      
      Payment payment=new PhonePay(); //UpCasting
      payment.pay();
	}

}
