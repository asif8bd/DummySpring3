package net.softengine.school.admin.model;


import net.softengine.school.security.model.User;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@DiscriminatorValue("teacher")
public class Teacher extends User implements Serializable {


    @OneToOne(mappedBy = "teacher")
    private Klass classOf;

    @OneToMany
    @JoinTable(name = "AD_JT_GROUP_STUDENT", joinColumns = @JoinColumn(name = "GROUP_ID"),
            inverseJoinColumns = @JoinColumn(name = "STUDENT_ID"))
    private List<Education> educationList = new ArrayList<Education>();


}
