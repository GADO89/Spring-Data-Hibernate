package com.springdata.hibernate.model;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     @Column(name = "id")
    private Long id;

    @Column(name = "full_name")
    private String name;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "student", fetch = FetchType.LAZY)
    private List<Info> infos=new ArrayList<>();

    public Student() {
    }

    public List<Info> getInfos() {
        return infos;
    }

    public void setInfos(List<Info> infos) {
        this.infos = infos;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
