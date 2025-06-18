package service;

import model.Investment;

import java.util.List;

public interface InvestmentService {
    Investment createInvestment(Investment investment);
    List<Investment> getInvestmentsByClient(Long clientId);
    double calculatePortfolioValue(Long clientId);
    double calculateROI(Long clientId);
    Investment updateInvestment(Long id, Investment investment);
    void deleteInvestment(Long id);
}
