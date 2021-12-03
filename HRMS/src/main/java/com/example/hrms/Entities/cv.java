package com.example.hrms.Entities;

import com.example.hrms.Entities.School.school;
import com.example.hrms.Entities.SocialMedia.socialMedia;
import com.example.hrms.Entities.cloudEntities.cloudPhoto;
import com.example.hrms.Entities.jobsExperience.jobsExperience;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;
import java.util.Set;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "cv")
public class cv {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @OneToMany(mappedBy = "scholName", fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    private Set<school> schollName;

    @OneToMany(mappedBy = "schoolSection", fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    private Set<school> schoolSections;

    @Column(name = "graduationYear")
    private String graduationYear;

    @OneToMany(mappedBy = "workplaceCv",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    private Set<jobsExperience> workplaces;

    @OneToMany(mappedBy = "jobPositionCv",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    private Set<jobsExperience> jobPositions;

    @OneToMany(mappedBy = "experienceCv",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    private Set<jobsExperience> experiences;

    @Column(name = "working")
    private String working;

    @Column(name = "language")
    private String language;

    @Transient
    @Max(value=5)
    @Min(value=1)
    private int launguageLevel;

    @OneToMany(mappedBy = "cv", fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    private Set<cloudPhoto> cloudPhotos;

    @OneToMany(mappedBy = "githubCv",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    private Set<socialMedia> github;

    @OneToMany(mappedBy = "linkedinCv",fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<socialMedia> linkedin;

    @Column(name = "programmingLanguage")
    private String programmingLanguage;

    @Size(max = 300)
    @Column(name = "coverLetter")
    private String coverLetter;
}
