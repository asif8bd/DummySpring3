package net.softengine.school.exam.model;



import net.softengine.school.admin.model.Student;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "EX_MARKS")
public class Marks implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    @ManyToOne
    private  Exam exam;

    @ManyToOne
    private MarksCalculationMethod mcm;

    @ManyToOne
    private Student student;

    private Double written;

    private Double mcq;

    private Double practical;


}
