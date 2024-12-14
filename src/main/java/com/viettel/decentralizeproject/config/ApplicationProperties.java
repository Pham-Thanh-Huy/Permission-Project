package com.viettel.decentralizeproject.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(
        prefix = "application",
        ignoreUnknownFields = true
)
@Data
public class ApplicationProperties {
}
