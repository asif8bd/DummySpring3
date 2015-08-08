package net.softengine.school.admin.model;


import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "AD_CLASS")
public class Klass implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;    // Nine, Ten etc

    @ManyToOne
    private Branch branch;

    @OneToOne
    private Teacher teacher;

    @OneToMany
    @JoinTable(name = "AD_JT_CLASS_STUDENT", joinColumns = @JoinColumn(name = "CLASS_ID"),
            inverseJoinColumns = @JoinColumn(name = "STUDENT_ID"))
    private List<Student> studentList = new ArrayList<Student>();




}
