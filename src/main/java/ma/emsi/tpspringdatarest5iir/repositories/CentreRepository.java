package ma.emsi.tpspringdatarest5iir.repositories;

import ma.emsi.tpspringdatarest5iir.model.Centre;
import ma.emsi.tpspringdatarest5iir.model.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource(path="centers")
public interface CentreRepository extends JpaRepository<Centre,Long> {

}
