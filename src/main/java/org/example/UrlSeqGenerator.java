package org.example;

public class UrlSeqGenerator implements GeneratorPath {

    private Integer inc = 1;

    @Override
    public String generatePath() {
        Integer res = inc;
        inc++;
        return res.toString();
    }
}
