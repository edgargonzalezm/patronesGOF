package com.edgargonzalezm.patrones.estructura.proxy;

import org.junit.Test;

import com.edgargonzalezm.patrones.estructura.proxy.Imagen;
import com.edgargonzalezm.patrones.estructura.proxy.ImagenProxy;

public class ProxyTest {
	
	@Test
	public void test(){
		Imagen imagen= new ImagenProxy("file1.jpg");
		imagen.display();
		
		imagen.display();
		assert(true);
	}
}
