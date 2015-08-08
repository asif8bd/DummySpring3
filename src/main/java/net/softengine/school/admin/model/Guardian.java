package net.softengine.school.admin.model;

import net.softengine.school.security.model.User;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@DiscriminatorValue("guardian")
public class Guardian extends User implements Serializable {

    private String relation;

    @OneToMany(mappedBy = "guardian")
    @JoinTable(name = "AD_JT_GUARDIAN_STUDENT", joinColumns = @JoinColumn(name = "GUARDIAN_ID"),
            inverseJoinColumns = @JoinColumn(name = "STUDENT_ID"))
    private List<Student> studentList = new ArrayList<Student>();
}
