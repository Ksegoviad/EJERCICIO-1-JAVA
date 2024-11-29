/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mybankaccount.ejercicio1;


public class Trianguloiso {
    //Atributos de la clase Trianguloiso
    private double base;
    private double lado;
    //Constructor para inicializar los atributos de la clase
    public  Trianguloiso(double base, double lado){
        if (base <= 0 || lado <= 0 || base >= 2 * lado){
            System.out.println("La base y el lado deben ser positivos y ademas debe cumplir con la desigualdad triangular. ");
        }else{
            this.base= base;
            this.lado=lado;
        }
    }
    //Método de acceso del atributo Base
    public double getBase(){
        return base;
    }
    //Método de acceso del atributo Lado
     public double getLado(){
        return lado;
    }
     //Método para conocer el Perímetro del triángulo
    public double Perimetro(){
        return 2*lado+base;
    }
    //Método para saber el área del triángulo
    public double Area (){
        double altura= Math.sqrt(Math.pow(lado, 2) - Math.pow(base / 2, 2));
        return (base * altura)/2;
    }
    /* Método para conocer el triángulo con mayor área en una matriz de triángulos
    se realiza un doble ciclo de repetición for para conseguir cada valor de la matriz*/
   public double TrianguloMayorA(Trianguloiso[][] matriz){
       double maxArea=0;
       if (matriz==null || matriz.length==0){
           System.out.println("La matriz tiene que tener elementos");
       }else{
           for (int i=0; i<matriz.length;i++){
               for(int j = 0; j < matriz[i].length;j++){
                   double area = matriz[i][j].Area();
                    if(area>maxArea){
                       maxArea=area;
                   }   
               }
           }
       }
       return maxArea;
   } 
}
