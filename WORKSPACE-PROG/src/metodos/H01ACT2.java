package metodos;
import java.util.Scanner;
public class H01ACT2 {
	public static void main (String[]args) {
		double num;
		num=LeerNum();
		System.out.println("El número leido es: "+num);
	}
	public static double LeerNum() {
		Scanner entrada = new Scanner (System.in);
		double num;
		System.out.println("Introduce el número: ");
		num=entrada.nextDouble();
		return(num);
	}
}
