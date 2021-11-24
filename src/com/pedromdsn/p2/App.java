package com.pedromdsn.p2;
import com.pedromdsn.p2.test.BicicletaTeste;

public class App {  
    public static boolean PRODUCTION = false;
    public static void main(String[] args) throws Exception {
        if (!PRODUCTION){
            BicicletaTeste.teste();
        }
    }
}
