package com.example.hrms.Entities;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="employer")
public class employer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "webSite")
    @NotNull
    @NotBlank
    private String webSite;

    @Column(name = "email")
    @NotNull
    @NotBlank
    @Email(message="Doğru email giriniz")
    @Pattern(regexp=".+@.+\\..+",message = "doğru email adresini giriniz")
    private String email;

    @Column(name = "tel")
    @NotNull
    @NotBlank
    private int tel;

    @Column(name = "password")
    @NotNull
    @NotBlank
    private String password;

    @NotBlank
    @NotNull
    @Transient
    private String tryPassword;
}
