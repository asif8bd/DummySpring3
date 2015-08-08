package net.softengine.school.exam.model;


import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "EX_EXAM")
public class Exam implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    private String description;

    @OneToMany
    @JoinTable(name = "AD_JT_EXAM_MARKS", joinColumns = @JoinColumn(name = "EXAM_ID"),
            inverseJoinColumns = @JoinColumn(name = "MARKS_ID"))
    private List<Marks> marksList = new ArrayList<Marks>();
}
