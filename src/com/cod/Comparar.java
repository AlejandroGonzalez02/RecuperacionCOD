package com.cod;

public class Comparar{
    String email = "";
    String ip = "127.0.0.2";

    Comparar(){
        email ="anonymous@danielcastelao.org";
    }

    Comparar(String param1){
        this.email = param1;
    }

    public boolean con(){
        if(email !="anonymous@danielcastelao.org"){
            return true;
        }
        else{
            return false;
        }
    }
}
