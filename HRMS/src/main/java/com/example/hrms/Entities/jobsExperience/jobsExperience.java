package com.example.hrms.Entities.jobsExperience;

import com.example.hrms.Entities.cv;
import lombok.*;

import javax.persistence.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "jobsExperience")
public class jobsExperience {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "workplace")
    private String workplace;

    @Column(name = "jobPosition")
    private String jobPosition;

    @Column(name = "experience")
    private int experience;

    @ManyToOne
    @JoinColumn(name = "workplace", insertable = false, updatable = false)
    private cv workplaceCv;

    @ManyToOne
    @JoinColumn(name = "jobPosition", insertable = false, updatable = false)
    private cv jobPositionCv;

    @ManyToOne
    @JoinColumn(name = "experience", insertable = false, updatable = false)
    private cv experienceCv;
}
