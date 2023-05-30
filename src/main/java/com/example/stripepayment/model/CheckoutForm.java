package com.example.stripepayment.model;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CheckoutForm {
    @NotNull
    @Min(4)
    private Integer amount;

    @NotNull
    @Size(min = 5,max = 200)
    private String featureRequest;

    @Email
    private String email;
}
