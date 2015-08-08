package net.softengine.school.admin.model;


import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "AD_GROUP")
public class Group implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;    // Science | Arts | Commerce

    private String description;



    @OneToMany
    @JoinTable(name = "AD_JT_GROUP_STUDENT", joinColumns = @JoinColumn(name = "GROUP_ID"),
            inverseJoinColumns = @JoinColumn(name = "STUDENT_ID"))
    private List<Student> studentList = new ArrayList<Student>();

}
