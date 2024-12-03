package metodos;

import java.util.Scanner;

public class H01ACT3 {
	public static void main (String[]args) {
		int num;
		num=numMayor();
		System.out.println("El número mayor es: "+num);
	}
	public static int numMayor(int a, int b, int c) {
		Scanner entrada = new Scanner (System.in);
		int mayor=0;
		int suma;
		int i,j;
		
		for (i = 0; i < 3; i++) 
			System.out.println("Escribe un número: ");
			int num=entrada.nextInt();
			if(num>mayor)
				mayor=num;
			return num;
	}
}
