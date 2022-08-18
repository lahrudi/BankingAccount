package com.bank.assessment.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    private Long customerNumber;

    private String login;

    private int passWordHash;

    private String name;

    private String phone;

    private String emailAddress;

    private Date registrationDate;

    @OneToMany(mappedBy = "branch")
    @LazyCollection(LazyCollectionOption.TRUE)
    private List<Account> accounts;

    @OneToMany(mappedBy = "branch")
    @LazyCollection(LazyCollectionOption.TRUE)
    private List<Loan> loans;
}