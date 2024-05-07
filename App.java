package com.petrasn;

import java.security.KeyPair;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.time.Duration;
import java.time.Instant;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )

    {
        Instant start1 = Instant.now();

        for (int i = 0; i < 10; i++) {

        RSAKeyGenerator rsaKeyGenerator = new RSAKeyGenerator();
        KeyPair  keyPair1= rsaKeyGenerator.getKeyPair();
        PublicKey publicKey1 =keyPair1.getPublic();
           // System.out.println(publicKey1);

        }
        Instant finish1 = Instant.now();
        long timeElapsed1 = Duration.between(start1, finish1).toMillis();
        System.out.println(timeElapsed1);



        Instant start2 = Instant.now();
        for (int i = 0; i < 10; i++) {
            String password = PasswordGenerator.generate(10);
           MyKeyGenerator myKeyGenerator = new MyKeyGenerator(password,password);
            KeyPair  keyPair2= myKeyGenerator.getKeyPair();
            PublicKey publicKey2 =keyPair2.getPublic();
             System.out.println(publicKey2);

        }
        Instant finish2 = Instant.now();
        long timeElapsed2 = Duration.between(start2, finish2).toMillis();
        System.out.println(timeElapsed2);



//      MyKeyGenerator myKeyGenerator = new MyKeyGenerator("MayPassword2");
//      KeyPair  keyPair= myKeyGenerator.getKeyPair();
//      PublicKey publicKey =keyPair.getPublic();
//
//        System.out.println( publicKey.toString().length());
//      PrivateKey privateKey= keyPair.getPrivate();
//        System.out.println( privateKey.toString().length());
//
//        RSAKeyGenerator rsaKeyGenerator = new RSAKeyGenerator();
//
//        KeyPair  keyPair1= rsaKeyGenerator.getKeyPair();
//        PublicKey publicKey1 =keyPair1.getPublic();
//
//        System.out.println( publicKey1.toString().length());
//        PrivateKey privateKey1= keyPair1.getPrivate();
//        System.out.println( privateKey1.toString().length());
    }
}
