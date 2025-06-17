package dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class InvestmentDto {

    private Long clientId;
    private String investmentType;

    private Double returnPercentage;
    private double amount;
}
