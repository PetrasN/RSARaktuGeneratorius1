package com.petrasn;

import java.util.Random;

public class PasswordGenerator {
    static String generate(int l)

    {
        Random rand = new Random();
        String str = rand.ints(48, 123)
                .filter(num -> (num<58 || num>64) && (num<91 || num>96))
                .limit(l)
                .mapToObj(c -> (char)c).collect(StringBuffer::new, StringBuffer::append, StringBuffer::append)
                .toString();

return str;
    }

    public static void main(String[] args) {
        for (int i = 0; i <100 ; i++) {
            System.out.println(PasswordGenerator.generate(12));
        }
    }
}
