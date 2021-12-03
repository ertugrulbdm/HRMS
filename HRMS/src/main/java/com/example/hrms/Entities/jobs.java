package com.example.hrms.Entities;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "jobs")
public class jobs {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "companyName")
    @NotNull
    @NotBlank
    private String companyName;

    @Column(name = "talent")
    @NotNull
    @NotBlank
    private String talent;

    @Column(name = "city")
    @NotNull
    @NotBlank
    private String city;

    @Column(name = "wage")
    @Min(value = 2800)
    @NotNull
    @NotBlank
    private double wage;

    @Column(name = "position")
    @NotNull
    @NotBlank
    private String position;

    @Column(name = "date")
    @NotNull
    @NotBlank
    private String date;

    @Column(name = "activity")
    @NotNull
    @NotBlank
    private boolean activity;
}
