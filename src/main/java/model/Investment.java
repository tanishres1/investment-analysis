package model;

import jakarta.persistence.*;
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
    private Long id;
    private String investmentType;
    private double amount;
    private double  returnPercentage;

    @ManyToOne
    @JoinColumn(name="client_id",referencedColumnName = "id")
    private Client client;
}
