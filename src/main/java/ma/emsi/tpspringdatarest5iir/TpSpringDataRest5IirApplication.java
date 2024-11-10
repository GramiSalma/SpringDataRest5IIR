package ma.emsi.tpspringdatarest5iir;

import ma.emsi.tpspringdatarest5iir.enums.Genre;
import ma.emsi.tpspringdatarest5iir.model.Centre;
import ma.emsi.tpspringdatarest5iir.model.Etudiant;
import ma.emsi.tpspringdatarest5iir.repositories.CentreRepository;
import ma.emsi.tpspringdatarest5iir.repositories.EtudiantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TpSpringDataRest5IirApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(TpSpringDataRest5IirApplication.class, args);
    }
    @Autowired
    EtudiantRepository etudiantRepository;


    @Autowired
    CentreRepository centreRepository;
    @Override
    public void run(String... args) throws Exception {
        // Création des étudiants
        Etudiant et1 = Etudiant.builder()
                .nom("Adnani1")
                .prenom("Morad1")
                .genre(Genre.Homme)
                .build();
        etudiantRepository.save(et1);

        Etudiant et2 = Etudiant.builder()
                .nom("Adnani2")
                .prenom("Morad2")
                .genre(Genre.Homme)
                .build();
        etudiantRepository.save(et2);

        Etudiant et3 = Etudiant.builder()
                .nom("Adnani3")
                .prenom("Morad3")
                .genre(Genre.Homme)
                .build();
        etudiantRepository.save(et3);

        Etudiant et4 = Etudiant.builder()
                .nom("Adnani4")
                .prenom("Morad4")
                .genre(Genre.Homme)
                .build();
        etudiantRepository.save(et4);

// Création des centres
        Centre centre1 = Centre.builder()
                .nom("Centre de Formation1")
                .adresse("Centre1 adresse")
                .build();
        centreRepository.save(centre1);

        Centre centre2 = Centre.builder()
                .nom("Centre de Formation2")
                .adresse("Centre2 adresse")
                .build();
        centreRepository.save(centre2);

// Assigner les deux premiers étudiants au premier centre
        et1.setCentre(centre1);
        et2.setCentre(centre1);

// Sauvegarder les modifications
        etudiantRepository.save(et1);
        etudiantRepository.save(et2);

// Optionnel : vérifier que les étudiants ont bien été associés
        System.out.println("Etudiant 1 Centre: " + et1.getCentre().getNom());
        System.out.println("Etudiant 2 Centre: " + et2.getCentre().getNom());

    }
}







