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
	 * @param array de numeros	el array de los numeros que queremos obtener la media
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
    

}
