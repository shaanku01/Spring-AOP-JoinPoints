package com.zemoso.aopdemo.dao;

import com.zemoso.aopdemo.gen.Account;
import org.springframework.stereotype.Component;

@Component
public class AccountDAO {

    private String name;
    private String serviceCode;


    public String getName() {
        System.out.println(getClass() + "In getName()");
        return name;
    }

    public String getServiceCode() {
        System.out.println(getClass() + "In getServiceCode()");
        return serviceCode;
    }

    public void setServiceCode(String serviceCode) {
        System.out.println(getClass() + "In setServiceCode()");
        this.serviceCode = serviceCode;
    }

    public void setName(String name) {
        System.out.println(getClass() + "In setName()");
        this.name = name;
    }

    public void addAccount(Account account, boolean vipFlag){
        System.out.println(getClass() + " :Doing MY DB WORK: Adding an account ");
    }

}
