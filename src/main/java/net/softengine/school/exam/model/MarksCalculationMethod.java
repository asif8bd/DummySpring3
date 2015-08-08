package net.softengine.school.exam.model;



import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "EX_MARKS_CAL_METHOD")
public class MarksCalculationMethod implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    private String methodCode;

    private Boolean effectOnFinal;

    private Integer percentage;

    @OneToMany
    @JoinTable(name = "AD_JT_MCM_MARKS", joinColumns = @JoinColumn(name = "CALCULATION_ID"),
            inverseJoinColumns = @JoinColumn(name = "MARKS_ID"))
    private List<Marks> marksList = new ArrayList<Marks>();
}

