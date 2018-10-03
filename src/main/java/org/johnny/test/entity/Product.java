package org.johnny.test.entity;

import lombok.Data;
import lombok.ToString;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.PositiveOrZero;
import javax.validation.constraints.Size;

@ToString
@Data
public class Product {
    @NotBlank
    @Size(min=2, message="Name should have atleast 2 characters")
    private String name;

    @PositiveOrZero
    @Max(1000)
    private int nr;

}
