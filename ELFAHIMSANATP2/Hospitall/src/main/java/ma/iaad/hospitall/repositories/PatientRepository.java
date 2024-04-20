package ma.iaad.hospitall.repositories;

import ma.iaad.hospitall.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient,Long> {
Patient findByNom(String name);

}
