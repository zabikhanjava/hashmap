package com.valtech.hashmap;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;

//@SpringBootTest
@ExtendWith(MockitoExtension.class)
class HashmapTests {

	//@Mock
	ClassB classB;
	//@InjectMocks
	ClassA classA;
	@Test
	void contextLoads() {

		classA.displayA();
		verify(classB).DisplayB();
	}
@BeforeEach
	public void set() {
	classB = Mockito.mock(ClassB.class);

	classA = new ClassA();

	MockitoAnnotations.initMocks(this);
}
}
