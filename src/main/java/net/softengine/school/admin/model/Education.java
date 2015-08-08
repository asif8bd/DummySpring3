package net.softengine.school.admin.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "AD_EDUCATION")
public class Education  implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "degree_name")
    private String degreeName;

    @Column(name = "passing_year")
    private Integer passingYear;

    private String result;

    @Column(name = "group_or_major")
    private String groupOrMajor;

    @ManyToOne
    private Teacher teacher;
}
