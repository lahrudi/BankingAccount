package com.bank.assessment.dto;

import com.bank.assessment.domain.AccountType;
import com.bank.assessment.domain.Branch;
import com.bank.assessment.domain.Customer;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import java.util.Currency;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AccountDto {

    private Long id;

    @NotNull
    private Long accountNumber;

    @NotNull
    private AccountType accountType;

    private Customer customer;

    @NotNull
    private Branch branch;

    @NotNull
    private Date openingDate;

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
