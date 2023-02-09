package com.valtech.hashmap;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;


class MultlipleConstructor {

	 String pop;

/*	private final Integer top;

	public MultlipleConstructor(Integer top) {
		this.top = top;
		this.pop=null;
	}
	public MultlipleConstructor(String pop) {
		this.pop = pop;
		this.top=null;

	}*/
}
public class testMultiargConstructor
{

	MultlipleConstructor multlipleConstructor;


	public static void main(String[] args) {


		//System.out.println(multlipleConstructor.pop);
	}
}