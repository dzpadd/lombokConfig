package edu.dpadd.lombok.altmodel;

import jakarta.validation.constraints.NotNull;
import lombok.Setter;

@Setter
public class AltShape {

    @NotNull
    private String id;
    private String name;
    private boolean opaque;
}
