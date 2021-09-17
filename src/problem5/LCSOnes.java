package problem5;

import java.util.ArrayList;

public class LCSOnes {

	public static void main(String[] args) {

		int arr[] = {1,1,0,1,1,0,1,0,1,1,0,1,1,1,1,0,1};
		
		// Convertimos el problema 
		
		ArrayList<Integer> lista = new ArrayList<Integer>();
		
		int secuenciaTotalUnos = 0;
		
		for (int i = 0 ; i < arr.length ; i++) {
			if( arr[i] == 1) {
				secuenciaTotalUnos++;
				if(secuenciaTotalUnos > 0 && i == arr.length-1) {
					lista.add(secuenciaTotalUnos);
				}
			} else {
				if(secuenciaTotalUnos>0) {
					lista.add(secuenciaTotalUnos);
				}
				lista.add(arr[i]);
				secuenciaTotalUnos = 0;
			}
		}
		
		System.out.println(lista);
		
		int maximaSecuencia = 0;
		for(int i = 0 ; i<lista.size() ; i=i+2) {
			int len = lista.get(i);
			if((i+1)<lista.size()) {
				len+=1;
			}
			if((i+2)<lista.size()) {
				len+= lista.get(i+2);
			}
			if(len> maximaSecuencia) {
				maximaSecuencia = len;
			}
		}
		
		System.out.println("Maxima secuencia: " + maximaSecuencia);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
