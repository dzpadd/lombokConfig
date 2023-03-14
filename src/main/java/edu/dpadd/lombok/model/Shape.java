package edu.dpadd.lombok.model;

import jakarta.validation.constraints.NotNull;
import lombok.Setter;

@Setter
public class Shape {

    @NotNull
    private String id;
    private String name;
    private boolean opaque;
}
