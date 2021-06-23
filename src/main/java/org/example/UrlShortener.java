package org.example;

public class UrlShortener {

    private String NEW_DOMAIN = "http://short.com/";

    private GeneratorPath generator;

    public UrlShortener(GeneratorPath generator) {
        this.generator = generator;
    }

    public String shortUrl(String inputUrl, String seoKeyword) {
        StringBuilder sb = new StringBuilder();
        if (seoKeyword.length() > 20) {
            throw new RuntimeException("Seo is longer than 20 characters");
        }

        sb.append(NEW_DOMAIN);
        sb.append(seoKeyword);

        return sb.toString();
    }

    public String shortUrl(String inputUrl) {
        StringBuilder sb = new StringBuilder();
        sb.append(NEW_DOMAIN);
        String shortUlr = generator.generatePath();
        sb.append(shortUlr);
        return sb.toString();
    }



}
