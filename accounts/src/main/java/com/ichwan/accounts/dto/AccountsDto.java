package com.ichwan.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
@Schema(
        name = "Accounts",
        description = "Schema to hold Account information"
)
public class AccountsDto {

    @NotEmpty(message = "AccountNumber cannot be a null or empty")
    @Pattern(regexp = "(^$|[\\d]{10})", message = "Account number must be 10 digits")
    private Long accountNumber;
    @NotEmpty(message = "Account type cannot be null or empty")
    private String accountType;
    @NotEmpty(message = "Branch address cannot be null or empty")
    private String branchAddress;
}
