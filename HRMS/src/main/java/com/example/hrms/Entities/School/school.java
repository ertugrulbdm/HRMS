package com.example.hrms.Entities.School;


import com.example.hrms.Entities.cv;
import lombok.*;

import javax.persistence.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "school")
public class school {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "schoolName")
    private String schoolName;

    @Column(name = "section")
    private String section;

    @ManyToOne
    @JoinColumn(name = "schoolName", insertable = false, updatable = false)
    private cv scholcv;

    @ManyToOne
    @JoinColumn(name = "section", insertable = false, updatable = false)
    private cv schoolSection;
}
