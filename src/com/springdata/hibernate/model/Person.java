package com.springdata.hibernate.model;


import javax.persistence.*;

@Entity
@Table(name = "person")
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     @Column(name = "id")
    private Long id;

    @Column(name = "full_name")
    private String name;

    @OneToOne(cascade =CascadeType.MERGE)
    @JoinColumn(name = "id_data")
    private Data data=new Data();

    public Person() {
    }

    public Data getData() {
        return data;
    }


    public void setData(Data data) {
        this.data = data;
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
