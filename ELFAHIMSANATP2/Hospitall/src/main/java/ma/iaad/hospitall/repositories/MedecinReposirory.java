package ma.iaad.hospitall.repositories;

import ma.iaad.hospitall.entities.Medecin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedecinReposirory extends JpaRepository<Medecin,Long> {
Medecin findByNom(String nom);
}
