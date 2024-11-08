package com.ichwan.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
@Schema(
        name = "Customer",
        description = "Schema to hold Customer and Account information"
)
public class CustomerDto {

    @Schema(description = "Name of the customer", example = "Ichwan Sholihin")
    @NotEmpty(message = "Name cannot be null or empty")
    @Size(min = 5,max = 30,message = "The length of customer name should be between 5 and 30")
    private String name;
    @Schema(description = "Email of the customer", example = "example@mail.com")
    @NotEmpty(message = "Email cannot be null or empty")
    @Email(message = "Email address should be valid format")
    private String email;
    @Schema(description = "Mobile phone of the customer", example = "123456789")
    @Pattern(regexp = "(^$|[\\d]{10})", message = "Mobile number must be 10 digits")
    private String mobileNumber;
    private AccountsDto accountsDto;
}
