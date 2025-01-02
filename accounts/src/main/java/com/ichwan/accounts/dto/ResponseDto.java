package com.ichwan.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Schema(
        name = "Response",
        description = "Schema to hold successful response information"
)
@Builder
@NoArgsConstructor
@AllArgsConstructor
//https://rollbar.com/blog/how-to-fix-method-constructor-in-class-cannot-be-applied-to-given-types-in-java/
public class ResponseDto {

    @Schema(description = "Status code in response", example = "200")
    private String statusCode;
    @Schema(description = "Status message in response", example = "request processed successfully")
    private String statusMsg;
}
