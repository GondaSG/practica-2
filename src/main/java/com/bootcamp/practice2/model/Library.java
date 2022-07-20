package com.bootcamp.practice2.model;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Schema(description = " Library Informacion")
@Data
@Entity
@Table(name = "librarie")
public class Library {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Schema(description = "name nvarchar")
    @NotNull(message = "name nvarchar can not be null.")
    @Size(min = 3, max = 70, message = "name nvarchar must have at least 3 characters.")
    @Column(name = "name", nullable = false, length = 70)
    private String name;

    @Schema(description = "direction char")
    @NotNull(message = "direction char can not be null.")
    @Size(min = 3, max = 70, message = "direction char must have at least 3 characters.")
    @Column(name = "direction", nullable = false, length = 70)
    private String direction;

}