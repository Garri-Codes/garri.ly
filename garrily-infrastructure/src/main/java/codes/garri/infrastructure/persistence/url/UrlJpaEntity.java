package codes.garri.infrastructure.persistence.url;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.hibernate.envers.Audited;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "url")
@Audited(withModifiedFlag = true)
public class UrlJpaEntity {
    private String originalUrl;

    private String shortUrl;

    private LocalDateTime expirationDate;

    @CreationTimestamp
    private LocalDateTime createdAt;

    @UpdateTimestamp
    private LocalDateTime updatedAt;

    public UrlJpaEntity() {}
}
