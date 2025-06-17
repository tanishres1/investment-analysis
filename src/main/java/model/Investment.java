package model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Investment {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long clinetId;
    private String investmentType;
    private double amount;
    private double  returnPercentage;
}
