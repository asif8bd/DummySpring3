package net.softengine.school.admin.model;


import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "AD_SECTION")
public class Section implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;  // Section A, Section B | Boy, Girl

    private String description;


    @OneToMany
    @JoinTable(name = "AD_JT_SECTION_STUDENT", joinColumns = @JoinColumn(name = "SECTION_ID"),
            inverseJoinColumns = @JoinColumn(name = "STUDENT_ID"))
    private List<Student> studentList = new ArrayList<Student>();
}
