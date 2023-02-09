package com.valtech.hashmap;


import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class SpringSetting {
	private static ApplicationContext applicationContext;

	@Autowired
	SomeDepentClass classs;
	@Value("${pop}")
	 String s;

	public static void main(String[] args) {
		applicationContext = new AnnotationConfigApplicationContext(SpringComponentScanApp.class);
		SpringSetting springSetting= (SpringSetting) applicationContext.getBean(SpringSetting.class);
		Environment environment = applicationContext.getEnvironment();

		String world = environment.getProperty("pop");
		springSetting.classs.some();
		System.out.println(springSetting.classs.classADepend.apple);
		log.trace("hello");
		log.debug("hello");
		log.info("hello");
		log.error("hello");
		log.trace("hello");
		System.out.println(	springSetting.s);
		System.out.println(	world);

		String dfsd= (String) applicationContext.getBean("some");
		String pome= (String) applicationContext.getBean("pome");
		System.out.println("dfsd"+dfsd);
		System.out.println("pome"+pome);


	}
}
