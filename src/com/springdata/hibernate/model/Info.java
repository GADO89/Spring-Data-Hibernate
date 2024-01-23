package com.springdata.hibernate.model;


import javax.persistence.*;

@Entity
@Table(name = "information")
public class Info {
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     @Column(name = "id")
     private Long id;

    @Column(name = "phone")
    private String phone;
    @ManyToOne
    @JoinColumn(name = "id_student")
    private Student student=new Student();



    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Info() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
