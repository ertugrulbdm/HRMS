package com.example.hrms.Entities.cloudEntities;

import com.example.hrms.Entities.cv;
import lombok.*;
import org.hibernate.annotations.GeneratorType;
import org.hibernate.annotations.Tables;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "cloudPhoto")
public class cloudPhoto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "photoUrlData")
    private String photoUrl;

    @ManyToOne
    @JoinColumn(name = "photoUrlData", insertable = false, updatable = false)
    private cv cv;

}
