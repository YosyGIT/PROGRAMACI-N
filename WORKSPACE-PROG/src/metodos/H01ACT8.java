package metodos;
import java.util.Scanner;
public class H01ACT8 {
	public static void main(String[]args) {
		int x=5;
		int v[]= new int [3];
		leeVector(x);
		maxVector(v);
	}
	public static void leeVector(int array[]) {
		Scanner entrada = new Scanner(System.in);
		int i;
		for (i = 0; i < array.length; i++) 
			System.out.println("Introduce un entero: ");
			array[i]=entrada.nextInt();
	}
	public static void maxVector(int array[]) {
		int i;
		int maximo = array[0];
		for (i = 0; i < array.length; i++) 
			if (array[i]>maximo) {
				maximo=array[i];
			return (maximo);
			}
	}
	public static void 
}
