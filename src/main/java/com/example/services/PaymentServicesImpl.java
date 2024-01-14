package com.example.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.PaymentsDAO;

@Service
public class PaymentServicesImpl implements PaymentsServices{

    @Autowired
    private PaymentsDAO paymentsDAO;

    public PaymentsDAO getPaymentsDAO() {
        return paymentsDAO;
    }

    public void setPaymentsDAO(PaymentsDAO paymentsDAO) {
        this.paymentsDAO = paymentsDAO;
    }

}
