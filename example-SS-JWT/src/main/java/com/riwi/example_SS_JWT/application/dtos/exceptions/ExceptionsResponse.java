package com.riwi.example_SS_JWT.application.dtos.exceptions;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Getter
@Setter
@SuperBuilder
public class ExceptionsResponse extends ExceptionBasic {
    private List<String> errors;
}
