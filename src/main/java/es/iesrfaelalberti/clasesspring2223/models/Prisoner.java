package es.iesrfaelalberti.clasesspring2223.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity @Getter @Setter
public class Prisoner {
    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private Integer age;
    @Column(nullable = false)
    private Integer yearsLeft;



    @ManyToOne
    @JoinColumn
    private Cell cell;


    public Prisoner(){

    }

    public Prisoner(String name, Integer age, Integer yearsLeft, Cell cell) {
        this.name = name;
        this.age = age;
        this.yearsLeft = yearsLeft;
        this.cell = cell;
    }
}
