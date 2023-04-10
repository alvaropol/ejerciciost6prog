package ejercicio03;

import java.util.Scanner;

public class CEcuacion2Grado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, c, discriminante, x1, x2;

        System.out.print("Introduce el coeficiente a: ");
        a=Double.parseDouble(sc.nextLine());

        System.out.print("Introduce el coeficiente b: ");
        b = Double.parseDouble(sc.nextLine());

        System.out.print("Introduce el coeficiente c: ");
        c = Double.parseDouble(sc.nextLine());

        try {
            if (a == 0 && b == 0) {
                throw new EcuacionDegenerada("La ecuación es degenerada.");
            } else {
                discriminante = b * b - 4 * a * c;
                if (discriminante < 0) {
                    throw new RaizCompleja("Las raíces son complejas.");
                } else if (a == 0 && b != 0) {
                    x1 = -c / b;
                    System.out.println("La ecuación tiene una única raíz real: " + x1);
                } else {
                    x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
                    x2 = (-b - Math.sqrt(discriminante)) / (2 * a);
                    System.out.println("Las raíces son: " + x1 + " y " + x2);
                }
            }
        } catch (Exception e) {
            System.out.println("Existe un error: " + e.getMessage());
        }finally {
        	sc.close();
        }
    }
}