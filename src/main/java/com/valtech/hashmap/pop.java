package com.valtech.hashmap;


import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;

public class pop {

	public static void main(String[] args) throws ExecutionException, InterruptedException {
		pop p=new pop();
		p.separate();
	}
	public void separate() throws ExecutionException, InterruptedException {
		ThreadPoolExecutor executor =
				(ThreadPoolExecutor) Executors.newFixedThreadPool(2);
		ExecutorService executorService= Executors.newSingleThreadExecutor();
		Future f=executorService.submit(this::sayHello);
		Future popopo=executorService.submit(this::sayHello);
		System.out.println(popopo.get());
	}
	public void sayHello()
	{
		System.out.println("january");
	}
}
