package com.ichwan.accounts.dto;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;
import java.util.Map;

@ConfigurationProperties(prefix = "accounts")
public record AccountDetailInfoDto(String description, Map<String, String> details, List<String> helps){

}
