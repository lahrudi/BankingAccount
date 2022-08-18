package com.bank.assessment.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Currency;
import java.util.Date;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @NotNull
    private Long accountNumber;

    @NotNull
    private AccountType accountType;

    @OneToOne
    @JoinColumn(name = "customer_ID")
    private Customer customer;

    @OneToOne
    @JoinColumn(name = "branch_ID")
    private Branch branch;

    @NotNull
    private Date openingDate;

    @NotNull
    private Long balance;

    private Long interestRate;

    private Currency currency;

    private Boolean active;

    @Override
    public String toString() {
        return "Account {" +
                "  accountNumber = " + accountNumber +
                ", balance = " + balance +
                ", openingDate = '" + openingDate.toString() + '\'' +
                "}";
    }
}
