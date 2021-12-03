package com.example.hrms.Entities.SocialMedia;

import com.example.hrms.Entities.cv;
import lombok.*;

import javax.persistence.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "socialMedia")
public class socialMedia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "github")
    private String github;

    @Column(name = "linkedin")
    private String linkedin;

    @ManyToOne
    @JoinColumn(name = "github")
    private cv githubCv;

    @ManyToOne
    @JoinColumn(name = "linkedin")
    private cv linkedinCv;
}
