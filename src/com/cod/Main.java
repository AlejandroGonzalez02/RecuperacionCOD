package com.cod;

public class Main {
  public static void main(String[] args){

    if (email01("pepe@danielcastelao.org")){
      System.out.println("Listo");
    }
    else {
      System.out.println("Fallo");
    }
    if(email02()){
      System.out.println("Listo");
    }
    else{
      System.out.println("Fallo");
    };
  }

  public static boolean email01(String email){
    Comparar inicio01 = new Comparar(email);
    System.out.println("Conectando a " + inicio01.ip + ", con el usuario " + email);
    return inicio01.con();
  }

  public static boolean email02(){
    Comparar inicio02 = new Comparar();
    System.out.println("Conectando a " + inicio02.ip + ", con el usuario " + inicio02.email);
    return inicio02.con();
  }
}
