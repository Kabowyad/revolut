package org.example;

import java.util.Random;

public class UrlRandomGenerator implements GeneratorPath {

    private String alphabet = "0123456789abcdABCD";

    private Integer finalLength = 4;

    @Override
    public String generatePath() {
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        int step = 1;
        while (step < finalLength) {
            sb.append(alphabet.charAt(random.nextInt(alphabet.length())));
            step++;
        }
        return sb.toString();
    }
}
