package com.valtech.hashmap;

import java.sql.SQLOutput;
import java.util.function.Consumer;

public class someCallBackClass {

	public static void main(String[] args){

		Consumer<String> pop=(c)->
		{
			System.out.println(c);
		};
		pop.accept("Zabi");

		Addintion addintion=(a,b)->
		{
			return a+b;
		};
		addintion.add(10,30);
		// implementing class
		Callback bac= (Callback) () -> {
			System.out.println("callback called");
		};
		new someCallBackClass().doWork(bac);
	}

	public void doWork(Callback callback) {
		System.out.println("doing work");
		callback.call();
	}
}
interface Callback {
		void call();
	}
interface Addintion
{
	public int add(int a,int b);
}