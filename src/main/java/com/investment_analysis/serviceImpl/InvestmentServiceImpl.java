package com.investment_analysis.serviceImpl;

import Reposirtory.ClinetRepository;
import Reposirtory.InvestmentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InvestmentServiceImpl {

    @Autowired
    private InvestmentRepo investmentRepo;

    @Autowired
    private ClinetRepository clinetRepository;

}
