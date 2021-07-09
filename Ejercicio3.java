import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe un numero entero");
		int num = sc.nextInt();
		
		boolean primo = primo(num);
		
		if (primo == true) {
			System.out.println("Es un numero primo");
		}else {
			System.out.println("No es numero primo");
		}

	}
	
	public static boolean primo (int num) {
		boolean primo = false;
		int c = 0;
		
		for (int i = 1; i<=num; i++) {
			if ((num%i) == 0) {
				c++;
			}
		}
		if (c <= 2) {
			primo = true;
		}
			
		return primo;	
	}

}
