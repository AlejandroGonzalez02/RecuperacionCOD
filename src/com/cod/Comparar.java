package com.cod;

public class Comparar {
    public static String email = "";
    String ip = "127.0.0.2";

    private static Comparar instance =null;


    public static Comparar getInstance() {
        if (instance == null){
            instance = new Comparar();
        }
            email = "anonymous@danielcastelao.org";
            return instance;
    }

    public static Comparar getInstance(String ema) {
            if(instance == null){
                instance = new Comparar();
            }

            email = ema;
            return instance;
    }

    public boolean verificacion() {
            if (email != "anonymous@danielcastelao.org") {
                return true;
            } else {
                return false;
            }
    }
}