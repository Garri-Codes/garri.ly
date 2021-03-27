package codes.garri.core.entities.url.repository;

import codes.garri.core.entities.url.Url;

public interface UrlRepository {
    Url getUrl(String hashUrl);

    Url createUrl(String url);
}
