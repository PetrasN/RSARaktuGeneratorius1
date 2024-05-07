package com.petrasn;

import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.interfaces.RSAPrivateKey;

public class RSAKeyGenerator {
 private    KeyPair keyPair;

    public RSAKeyGenerator() {
        KeyPairGenerator keyPairGenerator = null;
        try {
            keyPairGenerator = KeyPairGenerator.getInstance("RSA");
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
        keyPairGenerator.initialize(2048);
         keyPair = keyPairGenerator.generateKeyPair();

       //privateKey.toString().
    }

    public KeyPair getKeyPair() {
        return keyPair;
    }
}
