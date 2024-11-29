/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mybankaccount.ejercicio1;



/*Universidad Central del Ecuador
Trabajo en Grupo Nro1
Nombres: Panchi Nikolai, Nacimba Abigail,Safla Mateo,*/
public class Ejercicio1 {

    public static void main(String[] args) {
        //Ejercicio 1 parte a)
        Trianguloiso triangulo = new Trianguloiso(12,6);
        System.out.println("Base del triangulo " + triangulo.getBase());
        System.out.println("Lado del triangulo " + triangulo.getLado());
        System.out.println("Area del triangulo " + triangulo.Area());
        System.out.println("Perimetro del triangulo " + triangulo.Perimetro());
        
        //Ejercicio 1 parte b)
        Trianguloiso[][] matriz = {
            { new Trianguloiso(2, 5), new Trianguloiso(2, 3),new Trianguloiso(1,3) },
            { new Trianguloiso(3, 4), new Trianguloiso(1, 2),new Trianguloiso(4,6) },
            {new Trianguloiso(3,4), new Trianguloiso(6,9), new Trianguloiso(3,5)},
        };
         double areaMayor = triangulo.TrianguloMayorA(matriz);
         System.out.println("-------------------------------------------------");
        System.out.println("El Area del triangulo de mayor superficie es: " + areaMayor);
    }
}
