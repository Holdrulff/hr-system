package com.hr_system.project.entities;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data //Substitui Getters e Setters
@Entity //Essa classe representa uma entidade no DB
@Table(name = "employee") //Nome da tabela da entidade no banco
@AllArgsConstructor //Substitui o metodo construtor em que haja todos os argumentos
@NoArgsConstructor //Substitui o metodo construtor em que não haja todos os argumentos
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String name;
    @Column
    private Date initDate;
    @Column
    private int salary;
    @Column
    private String position;
    @Column
    private String team;
    @Column
    private Date finalDate;
}
