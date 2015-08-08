package net.softengine.school.exam.model;



import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "EX_SUBJECT")
public class Subject implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
}
