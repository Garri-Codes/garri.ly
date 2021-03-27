package codes.garri.core.entities.url;

import java.time.LocalDateTime;
import java.util.Base64;
import java.util.Objects;
import java.util.Optional;

public class Url {

    private final String originalUrl;

    private final String shortUrl;

    private final LocalDateTime expirationDate;

    public Url newUrl(String originalUrl, LocalDateTime expirationDate) {
        String shortUrl = this.encode(originalUrl);

        return new Url(originalUrl, shortUrl, expirationDate);
    }

    public Url existingHashUrl(String shortUrl, LocalDateTime expirationDate) {
        return new Url(null, shortUrl, expirationDate);
    }

    public Url existingUrl(String originalUrl, String shortUrl, LocalDateTime expirationDate) {
        return new Url(originalUrl, shortUrl, expirationDate);
    }

    public String encode(String originalUrl) {
        return Base64.getUrlEncoder().encodeToString(originalUrl.getBytes());
    }

    public Optional<String> getOriginalUrl() {
        return Optional.ofNullable(originalUrl);
    }

    public String getHashUrl() {
        return shortUrl;
    }

    public Optional<LocalDateTime> getExpirationDate() {
        return Optional.ofNullable(expirationDate);
    }

    private Url(final String originalUrl, final String shortUrl, final LocalDateTime expirationDate) {
        this.originalUrl = originalUrl;
        this.shortUrl = Objects.requireNonNull(shortUrl, "short url must be not null");;
        this.expirationDate = expirationDate;
    }
}

