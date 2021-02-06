package codes.garri.api.dtos;

public class ShortenUrlDTO {
    private final String longUrl;

    private final String shortUrl;

    public ShortenUrlDTO(final String longUrl, final String shortUrl) {
        this.longUrl = longUrl;
        this.shortUrl = shortUrl;
    }

    public String getLongUrl() {
        return longUrl;
    }

    public String getShortUrl() {
        return shortUrl;
    }
}
