package DesignProblems.ElevatorDesign.TinyUrlDemo;

/**
 * Created by sourabh on 20/7/16.
 */
public class ShortenerService {
    LocalPersistence localPersistence;

    String getShortUrl(String longUrl) {
        Integer hash = longUrl.hashCode();
        String base62 = Integer.toString(hash, 62);
        localPersistence.put(String.valueOf(hash), new StringPair(longUrl, base62));
        return base62;
    }

    String getLongUrl(String shortUrl) {
        Integer index = Integer.valueOf(shortUrl, 62);
        return localPersistence.get(String.valueOf(shortUrl)).longUrl;
    }

    Integer getHashCode(String longUrl) {
        return longUrl.hashCode();
    }


}
