package com.petrasn;

import java.security.KeyPair;
import java.security.PrivateKey;
import java.security.interfaces.RSAPrivateKey;

public class TestasPasikartojomumo {
    public static void main(String[] args) {
        String psw = "Mano paswordas";
        MyKeyGenerator myKeyGenerator = new MyKeyGenerator(psw,psw);
        KeyPair keyPair = myKeyGenerator.getKeyPair();
        RSAPrivateKey privateKey = (RSAPrivateKey) keyPair.getPrivate();
       String modulus=privateKey.getModulus().toString();
        System.out.println(modulus);

        for (int i = 0; i < 100; i++) {

            MyKeyGenerator myKeyGenerator1 = new MyKeyGenerator(psw,psw);
            KeyPair keyPair1 = myKeyGenerator.getKeyPair();
            RSAPrivateKey privateKey1 = (RSAPrivateKey) keyPair.getPrivate();
            String modulus1 =privateKey1.getModulus().toString();
            if (modulus1.equals(modulus)) {
                System.out.println("lygus");
            } else {
                System.out.println("nelygus");

            }


        }
    }
}