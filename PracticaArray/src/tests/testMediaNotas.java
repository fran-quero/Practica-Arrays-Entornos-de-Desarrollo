package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import util.MisArrays;

class testMediaNotas {

	
	static int [] array1;
	static int [] array2;
	static int [] array3;
	
	@BeforeAll
	static void setup() {
		array1 = new int [] {1,2,3,4};
		array2 = new int [] {2,4,6,8};
		array3 = new int [] {5,-2,3,5};
		
	}
	
	@Test
	void mediaNotasArray1() {
		float numEsperado = 2.5f;
		float numObtenido = MisArrays.mediaNotas(array1);
		assertEquals(numEsperado,numObtenido);		 
	}
	
	@Test
	void mediaNotasArray2() {
		float numEsperado = 5f;
		float numObtenido = MisArrays.mediaNotas(array2);
		assertEquals(numEsperado,numObtenido);		 
	}
	
	@Test
	void mediaNotasArray3() {
		Exception ex = assertThrows(IllegalArgumentException.class, ()-> MisArrays.mediaNotas(array3));
		String mensajeEsperado = "Las notas deben estar entre 0 y 10";
		String mensajeObtenido = ex.getMessage();
		assertEquals(mensajeEsperado,mensajeObtenido);
	}

}
