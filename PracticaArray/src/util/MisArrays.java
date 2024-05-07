package util;

import java.util.Arrays;

public abstract class MisArrays {
	
	/**
	 * Devuelve la media en float de los numeros que hay dentro de un array de numeros de tipo int
	 * 
	 * @param array de numeros	el array de los numeros que queremos obtener la media
	 * @return					el numero que nos da tras calcular la media de tipo float
	 * @throws IllegalArgumentException	Excepcion lanzada si alguna nota no esta entre los parametros indicados
	 */
	public static float mediaNotas(int[] notas) {
		     
        int suma = 0;
        
        for (int nota : notas) {
            if (nota < 0 || nota > 10) {
                throw new IllegalArgumentException("Las notas deben estar entre 0 y 10");
            }
            suma += nota;
        }
        
        float media= (float)suma/notas.length;

        return media;
        
	}
	
	/**
	 * Devuelve la nota mediana en float de los numeros que hay dentro de un array de numeros de tipo int
	 * 
	 * @param array de numeros	el array de los numeros que queremos obtener la mediana
	 * @return					el numero que indica la mediana de tipo float
	 * @throws IllegalArgumentException	Excepcion lanzada si alguna nota no esta entre los parametros indicados
	 */
	public static float medianaNotas(int[] notas) {
			
		for (int nota : notas) {
            if (nota < 0 || nota > 10) {
                throw new IllegalArgumentException("Las notas deben estar entre 0 y 10");
            }
        }
               
        Arrays.sort(notas);

        int total = notas.length;
        
        if (total % 2 == 0) {

            float mitadIzq = (float) notas[total / 2 - 1];
            float mitadDer = (float) notas[total / 2];
            
            
            float media = ((mitadIzq + mitadDer) / 2);
            return media ;
            
        } else {
        	float mitad = (float) notas[total/2];
            return mitad;
            
        }
    }
	
	
	/**
	 * Devuelve la nota mas alta en int de los numeros que hay dentro de un array de numeros de tipo int
	 * 
	 * @param array de numeros	el array de los numeros que queremos obtener la nota mas alta
	 * @return					el numero mas alto que hay en el array de tipo int
	 * @throws IllegalArgumentException	Excepcion lanzada si alguna nota no esta entre los parametros indicados
	 */
	public static int maximaNota(int[] notas) {
        
        int numMax = notas[0];
        
        for (int nota : notas) {
        	
            if (nota < 0 || nota > 10) {
                throw new IllegalArgumentException("Las notas deben estar entre 0 y 10");
            }
            if (nota > numMax) {
            	numMax = nota;
            }
        }

        return numMax;
    }
	
	
	/**
	 * Devuelve la nota mas baja en int de los numeros que hay dentro de un array de numeros de tipo int
	 * 
	 * @param array de numeros	el array de los numeros que queremos obtener la nota mas baja
	 * @return					el numero mas bajo que hay en el array de tipo int
	 * @throws IllegalArgumentException	Excepcion lanzada si alguna nota no esta entre los parametros indicados
	 */
	public static int minimaNota(int[] notas) {
        
        int numMin = notas[0];
        
        for (int nota : notas) {
        	
            if (nota < 0 || nota > 10) {
                throw new IllegalArgumentException("Las notas deben estar entre 0 y 10");
            }
            if (nota < numMin) {
            	numMin = nota;
            }
        }

        return numMin;
    }
	
	
    

}
