package com.bootcamp.practice2.model;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Schema(description = "Editorial Informacion")
@Data
@Entity
@Table(name = "editorial")
public class Editorial {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Schema(description = "names")
    @NotNull(message = "names can not be null.")
    @Size(min = 3, max = 70, message = "names must have at least 3 characters.")
    @Column(name = "name", nullable = false, length = 70)
    private String name;

    @Schema(description = "direction")
    @NotNull(message = "direction can not be null.")
    @Size(min = 3, max = 70, message = "direction must have at least 3 characters.")
    @Column(name = "direction", nullable = false, length = 70)
    private String direction;

}