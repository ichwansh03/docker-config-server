package com.ichwan.accounts.service;

import com.ichwan.accounts.dto.CustomerDto;

public interface IAccountService {

    /**
     *
     * @param customerDto Object created
     */
    void createAccount(CustomerDto customerDto);

    CustomerDto fetchAccount(String mobileNumber);

    boolean updateAccount(CustomerDto customerDto);

    boolean deleteAccount(String mobileNumber);
}
