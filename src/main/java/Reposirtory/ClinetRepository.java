package Reposirtory;

import model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClinetRepository extends JpaRepository<Client, Long > {
}
