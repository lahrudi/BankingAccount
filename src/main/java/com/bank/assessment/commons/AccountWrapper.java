package com.bank.assessment.commons;

import com.bank.assessment.domain.Account;
import com.bank.assessment.dto.AccountDto;
import org.modelmapper.ModelMapper;

/**
 * @author Alireza Gholamzadeh Lahroodi
 */
public final class AccountWrapper {
    private static ModelMapper mapper = new ModelMapper();

    /**
     * convert entity to DTO
     * @param account
     * @return
     */
    public static AccountDto mapToDTO(Account account) {
        AccountDto commentDto = mapper.map(account, AccountDto.class);
        return commentDto;
    }

    /**
     * convert DTO to entity
     * @param accountDto
     * @return
     */
    public static Account mapToEntity(AccountDto accountDto) {
        Account comment = mapper.map(accountDto, Account.class);
        return comment;
    }
}
