package com.corejava.operators;

public class IncrementDecrementOperator {

	static float h;
	public static void main(String[] args) {

		int x=10;
		System.out.println("x:"+x);//10
		//preincrement operator
		int y=++x;
		
		System.out.println("x:"+x); //11
		System.out.println("y:"+y); //11
		
		System.out.println("**********************");
		int a=10;
		System.out.println("a:"+a); //10
		//postincrement 
		int b=a++;
		System.out.println("b:"+b); //10
		System.out.println("a:"+a); //11

		System.out.println("*********************");
		int c=a+b; //11+10
		System.out.println("c:"+c);//21
		
		System.out.println("++++++++++++++++++++++");
		int d=++c+(a++)+(--a)+(b--)+(++b)+(c--); //22+11+11+10+10+22=
		System.out.println("a:"+a);//11
		System.out.println("b:"+b);//10
		System.out.println("c:"+c);//21

		
		System.out.println("d:"+d); //86
		
		int i=10;
		//operator ++ and -- cannot be applied on constants.
		//int j=++(++i);  
		
		
		final int j=20;
		
		//for final variable also we cannot apply ++ or -- operator
        //int k=++j;		
		
		System.out.println("&&&&&&&&&&&&");
		float m=10;
		
		//for floating point value also we can apply ++ and -- operator
		System.out.println("m:"+m); //10.0
		
		System.out.println("m:"+(++m)); //11.0
		
		
		System.out.println("h:"+h); //0.0
		
		System.out.println("%%%%%%%%%%%%%%%%%");
		System.out.println("i:"+i); //10
		
		//difference b/w i++ and i=i+1
		i=i+1;
		//i++;
		
		System.out.println("i:"+i); //11
		
		
		
		
	}

}
