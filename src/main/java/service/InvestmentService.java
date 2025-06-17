package service;

import Reposirtory.InvestmentRepo;
import dto.InvestmentDto;
import model.Investment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class InvestmentService {

    @Autowired
    private InvestmentRepo investmentRepo;

    public List<InvestmentDto> getInvestmentsByClient(Long clientId) {
        return investmentRepo.findByClientId(clientId).stream()
                .map(this::convertToDto)
                .collect(Collectors.toList());
    }

    public Double   calculateTotalReturn(Long clientId){
        List<Investment> investments =investmentRepo.findByClientId(clientId);
        double tottalReturn=investments.stream().mapToDouble(inv->inv.getAmount()*inv.getReturnPercentage()/100)
                .sum();
        return tottalReturn;

    }


    private InvestmentDto convertToDto(Investment inv) {
        return new InvestmentDto(
                inv.getClinetId(),
                inv.getInvestmentType(),
                inv.getAmount(),
                inv.getReturnPercentage()
        );

    }
}
