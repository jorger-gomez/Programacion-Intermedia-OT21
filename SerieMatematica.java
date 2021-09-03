import java.io.*;
import java.util.*;
class SerieMatematica {
  public static void main(String[] args) {
    double suma = 1;
    double termino = 0;
    int i = 0;
    double x=validarX();
    suma=sumar(x,i,termino, suma);
  }

  public static double validarX(){
    Scanner s=new Scanner (System.in);
    System.out.println("Ingresa el valor de x");
    double x=s.nextDouble();
    if((x>=0) && (x<=1)){
    }
    else{
      while ( (x>1) || (x<0) ){
        Scanner v=new Scanner (System.in);
        System.out.println("Ingresa el valor de x");
        double x1=v.nextDouble();
        x=x1;
      }
    }
    return x;
  }

  public static double validarTermino(double x, int i, double termino){
    int iFactorial = 1;
    i+=1;
    for (int contador=1;contador<=i;contador++)
      iFactorial = iFactorial * contador;
    termino=(Math.pow(x,i))/iFactorial;
    if (termino>Math.pow(10,-8)){
    }
    else{
      termino=0;
    }
    return termino;
  }

  public static double sumar(double x, int i, double termino, double suma){
    do {
      suma=suma + termino;
      termino=validarTermino(x, i, termino);
      i+=1;
    }
    while (termino!=0);
      System.out.println("La suma es igual a:" + suma);
    return suma;
  }
}