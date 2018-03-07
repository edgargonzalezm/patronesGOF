package com.edgargonzalezm.patrones.creacion.singleton;

import org.junit.Test;

import com.edgargonzalezm.patrones.creacion.singleton.Singleton;

public class SingletonTest {

	@Test
	public void test1() {
		String nombre=Singleton.getInstance().getName();
		System.out.println("Test 1 "+nombre); 
		System.out.println(Singleton.getInstance().getId());
		assert(true);
	}
	
	@Test
	public void test2() {
		String nombre=Singleton.getInstance().getName();
		System.out.println("Test 2 "+nombre); 
		System.out.println(Singleton.getInstance().getId());
		assert(true);
	}
	
	@Test
	public void test3() {
		String nombre=Singleton.getInstance().getName();
		System.out.println("Test 3 "+nombre); 
		System.out.println(Singleton.getInstance().getId());
		assert(true);
	}
	
	@Test
	public void test4() {
		String nombre=Singleton.getInstance().getName();
		System.out.println("Test 4 "+nombre); 
		System.out.println(Singleton.getInstance().getId());
		assert(true);
	}

}
