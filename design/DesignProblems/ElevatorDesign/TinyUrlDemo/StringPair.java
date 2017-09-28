package DesignProblems.ElevatorDesign.TinyUrlDemo;

/**
 * Created by sourabh on 20/7/16.
 */
public class StringPair {
    String longUrl;
    String shortUrl;

    public StringPair(String longUrl, String base62) {
        this.longUrl = longUrl;
        this.shortUrl = base62;
    }
}
