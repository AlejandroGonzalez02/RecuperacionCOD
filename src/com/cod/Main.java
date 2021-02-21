package com.cod;

/**
 * @author Alejandro Gonzalez Alonso
 * @version 1.0
 */

public class Main {
    public static void main(String[] args){

      if (email01("pepe@danielcastelao.org")){
        System.out.println("Listo");
      } else {
        System.out.println("Fallo");
      }
      if(email02()){
        System.out.println("Listo");
      } else{
        System.out.println("Fallo");
      }
    }

    public static boolean email01(String email){
      Comparar inicio01 = Comparar.getInstance(email);
      System.out.println("Conectando a " + inicio01.ip + ", con el usuario " + email);
      return inicio01.verificacion();
    }

    public static boolean email02(){
      Comparar inicio02 = Comparar.getInstance();
      System.out.println("Conectando a " + inicio02.ip + ", con el usuario " + inicio02.email);
      return inicio02.verificacion();
    }
}
