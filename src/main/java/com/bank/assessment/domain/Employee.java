package com.bank.assessment.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    private String login;

    private int passWordHash;

    private String name;

    private String phone;

    private String emailAddress;

    private Date registrationDate;

    private String position;

    @OneToOne
    @JoinColumn(name = "manager_ID")
    private Employee manager;

    @OneToOne
    @JoinColumn(name = "branch_id")
    private Branch branch;
}