package com.example.hrms.Entities;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "jobSeekers")
public class jobSeekers {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    @NotNull
    @NotBlank
    private String name;

    @Column(name = "surname")
    @NotNull
    @NotBlank
    private String surname;

    @Column(name = "tc")
    @NotNull
    @NotBlank
    @Size(max = 11,message = "11 karakter girmelisiniz")
    private int tcNo;

    @Column(name = "birthDay")
    @NotNull
    @NotBlank
    private Date birthDay;

    @Column(name = "email")
    @NotNull
    @NotBlank
    @Email(message = "lütfen mail adresini giriniz")
    @Pattern(regexp=".+@.+\\..+",message = "doğru email adresini giriniz")
    private String email;

    @Column(name = "password")
    @NotNull
    @NotBlank
    @Size(max=6,message = "6 karakterli güçlü bir şifre giriniz")
    private String password;

    @NotNull
    @NotBlank
    @Transient
    @Size(max = 6,message = "şifre tekrarınızı giriniz")
    private String tryPassword;

}
