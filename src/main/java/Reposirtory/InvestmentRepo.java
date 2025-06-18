package Reposirtory;

import dto.InvestmentDto;
import model.Investment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface InvestmentRepo extends JpaRepository<Investment, Long> {

}
