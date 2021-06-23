package org.example;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

/**
 * Unit test for simple App.
 */
public class AppTest
{
    private UrlRandomGenerator generator = Mockito.mock(UrlRandomGenerator.class);
    private UrlSeqGenerator seqGenerator = new UrlSeqGenerator();

    @Test
    public void shouldShortNewWs() {
        UrlShortener urlShortener = new UrlShortener(generator);
        String url = "http://looooong.com/somepath";
        String seo = "MY-NEW-WS";
        Assert.assertEquals("http://short.com/MY-NEW-WS", urlShortener.shortUrl(url, seo));
    }

    @Test(expected = RuntimeException.class)
    public void testNotMoreThen20CharSeo() {
        UrlShortener urlShortener = new UrlShortener(generator);
        String seo = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
        urlShortener.shortUrl("", seo);
    }

    @Test
    public void testUrl4Char() {
        UrlShortener urlShortener = new UrlShortener(generator);
        String input = "http://looooong.com/somepath";
        String shouldReturn = "ZfGd";
        Mockito.when(generator.generatePath()).thenReturn(shouldReturn);
        Assert.assertEquals("http://short.com/ZfGd", urlShortener.shortUrl(input));
    }

    @Test
    public void testSeqUrlShort() {
        UrlShortener urlShortener = new UrlShortener(seqGenerator);

    }
}
