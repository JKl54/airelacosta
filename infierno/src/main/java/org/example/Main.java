package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);

        double temperaturaAmbiente;
        System.out.print("Digite la temperatura ambiente:");
        temperaturaAmbiente=teclado.nextDouble();

        if (temperaturaAmbiente == 20.0) {
            temperaturaAmbiente = 25.0;
            System.out.println("Apreciado usuario, su temperatura a cambiado a:");

        }else if (temperaturaAmbiente == 30.0){
            temperaturaAmbiente = 20.0;
            System.out.println("Apreciado usuario, su temperatura a cambiado a:");

        }else if (temperaturaAmbiente == 40.0){
            temperaturaAmbiente =20.0;
            System.out.println("Apreciado usuario, su temperatura a cambiado a:");
        }else {
            System.out.print("Apreciado usuario, Qué temperatura desea?");
            temperaturaAmbiente = teclado.nextDouble();
            System.out.println("Apreciado usuario, su temperatura a cambiado a:");
        }



    }
}