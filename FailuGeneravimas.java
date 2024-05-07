package com.petrasn;

import java.io.FileWriter;
import java.io.IOException;
import java.math.BigInteger;
import java.security.KeyPair;
import java.security.interfaces.RSAPrivateKey;
import java.util.ArrayList;
import java.util.List;

public class FailuGeneravimas {
    public static void main(String[] args) {
      StringBuilder stringBuilder = new StringBuilder();

        // String fileName ="RSAKey.txt";
      String fileName ="MyRSAKey.txt";

   try(FileWriter fileWriter = new FileWriter(fileName)){
       for (int i = 0; i <1000 ; i++) {
           String password = PasswordGenerator.generate(12);
           String druska = PasswordGenerator.generate(12);
           //RSAKeyGenerator keyGenerator = new RSAKeyGenerator();
           MyKeyGenerator keyGenerator = new MyKeyGenerator(password,druska);
           KeyPair keyPair = keyGenerator.getKeyPair();
           RSAPrivateKey rsaPrivateKey = (RSAPrivateKey) keyPair.getPrivate();
           BigInteger exponent = rsaPrivateKey.getPrivateExponent();
           BigInteger modulus = rsaPrivateKey.getModulus();
           stringBuilder.append(exponent.toString(2));
           stringBuilder.append(modulus.toString(2));
       }
       fileWriter.write(stringBuilder.toString());
   } catch (IOException e) {
       throw new RuntimeException(e);
   }
        System.out.println("Jau");
    }





    // System.out.println(exponent.bitLength());
            //  System.out.println(modulus.bitLength());
//      String password=   PasswordGenerator.generate(12);
//      MyKeyGenerator myKeyGenerator = new MyKeyGenerator(password);
//      KeyPair  keyPair = myKeyGenerator.getKeyPair();
//      RSAPrivateKey rsaPrivateKey =(RSAPrivateKey) keyPair.getPrivate();
//          System.out.println(rsaPrivateKey.getModulus().bitLength());
//            System.out.println(rsaPrivateKey.getPrivateExponent().bitLength());




}
