package net.softengine.school.admin.model;


import net.softengine.school.exam.model.Marks;
import net.softengine.school.security.model.User;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@DiscriminatorValue("student")
public class Student extends User implements Serializable {

    @Column(name = "roll_no")
    private String rollNo;

    private String father;

    private String mother;

    @Temporal(TemporalType.DATE)
    @Column(name = "birth_date")
    private Date birthDate;

    @ManyToOne
    private Klass klass;


    @ManyToOne
    private Group group;

    @ManyToOne
    private Section section;

    @ManyToOne
    private Guardian guardian;

    @OneToMany
    @JoinTable(name = "AD_JT_STUDENT_MARKS", joinColumns = @JoinColumn(name = "STUDENT_ID"),
            inverseJoinColumns = @JoinColumn(name = "MARKS_ID"))
    private List<Marks> marksList = new ArrayList<Marks>();


}
