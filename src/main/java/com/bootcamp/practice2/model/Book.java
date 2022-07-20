package com.bootcamp.practice2.model;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Schema(description = "Book Informacion")
@Data
@Entity
@Table(name = "book")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Schema(description = "editorial names")
    @NotNull(message = "editorial names can not be null.")
    @Size(min = 3, max = 70, message = "editorial names must have at least 3 characters.")
    @ManyToOne
    @JoinColumn(name="editorial_id", nullable=false)
    private Editorial editorial;

    @Schema(description = "library")
    @NotNull(message = "library can not be null.")
    @Size(min = 3, max = 70 , message = "library must have at least 3 characters.")
    @ManyToOne
    @JoinColumn(name="library_id", nullable=false)
    private Library library;

    @Schema(description = "name nvarchar")
    @NotNull(message = "name nvarchar can not be null.")
    @Pattern(regexp = "^[0-9]*$", message = "name nvarchar must contain only numeric digits.")
    @Size(min = 8, max = 8, message = "name nvarchar must have 8 digits.")
    @Column(name = "name", nullable = false, length = 8, unique = true)
    private String name;

    @Schema(description = "tomo")
    @NotNull(message = "tomo can not be null.")
    @Size(min = 3, max = 70, message = "tomo must have at least 3 characters.")
    @Column(name = "tomo", nullable = false, length = 70)
    private String tomo;

    @Schema(description = "autor nvarchar")
    @NotNull(message = "autor nvarchar can not be null.")
    @Size(min = 3, max = 70, message = "autor nvarchar must have at least 3 characters.")
    @Column(name = "autor", nullable = false, length = 70)
    private String autor;

}