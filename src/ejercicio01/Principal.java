package ejercicio01;

import java.util.Scanner;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int menu=1, num1, num2;
		double result;
		Scanner sc = new Scanner(System.in);

		
	
			do {
				try {
				System.out.println("---------------");
				System.out.println("1.SUMAR\n" + "2.RESTAR\n" + "3.MULTIPLICAR\n" + "4.DIVIDIR\n" + "5.RAÍZ\n"
						+ "0.SALIR");
				System.out.println("---------------");
				menu = Leer.datoInt();
			
					switch (menu) {
					case 0:
						System.out.println("Saliendo...");
						break;
					case 1:
						System.out.println("Primer número:");
						num1=Integer.parseInt(sc.nextLine());
						System.out.println("Segundo número:");
						num2=Integer.parseInt(sc.nextLine());
						result = num1 + num2;
						System.out.println("Resultado: " + result);
						break;
					case 2:
						System.out.println("Primer número:");
						num1=Integer.parseInt(sc.nextLine());
						System.out.println("Segundo número:");
						num2=Integer.parseInt(sc.nextLine());
						result = num1 - num2;
						System.out.println("Resultado: " + result);
						break;
					case 3:
						System.out.println("Primer número:");
						num1=Integer.parseInt(sc.nextLine());
						System.out.println("Segundo número:");
						num2=Integer.parseInt(sc.nextLine());
						result = num1 * num2;
						System.out.println("Resultado: " + result);
						break;
					case 4:
						System.out.println("Primer número:");
						num1=Integer.parseInt(sc.nextLine());
						System.out.println("Segundo número:");
						num2=Integer.parseInt(sc.nextLine());
						result = num1 / num2;
						System.out.println("Resultado: " + result);
						break;
					case 5:
						System.out.println("Indique el discriminante");
						num1=Integer.parseInt(sc.nextLine());
						result = Math.sqrt(num1);
						System.out.println("Resultado: " + result);
						break;
						default:
							System.out.println("¡Valor incorrecto!");
							break;
					}
				} catch (ArithmeticException a) {
					System.out.println("¡Error, no puede dividir entre cero!");
				} catch (NumberFormatException n) {
					System.out.println("¡Error, ese tipo de dato no es válido!");
				} catch (Exception e) { 
					System.out.println("¡Error inesperado!");
				}finally {
					sc.close();
				}

			} while (menu == 0);
			System.out.println("Gracias por usar el programa");
		} 
	}

