package ejercicio02;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		double gradosC = 0,gradosF;
		Scanner sc= new Scanner(System.in);
	
		do {
		try {
			
			System.out.println("Grados Celsius:");
			gradosC=Double.parseDouble(sc.nextLine());
			
			if(gradosC<-273) {
				throw new GradosInferiores("No puedes poner una temperatura más fría que -273ºC");
			}else {
				gradosF=(gradosC*1.8)+32;
				System.out.println(gradosF);
			}
		}catch(GradosInferiores g){
			
			System.out.println(g.getMessage());
		}
		
		}while(gradosC<-273);
		
		sc.close();
		
		System.out.println("Gracias por usar el programa");
	}

}
