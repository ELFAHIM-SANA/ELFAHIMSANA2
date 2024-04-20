package ma.iaad.hospitall.web;

import ma.iaad.hospitall.entities.Patient;
import ma.iaad.hospitall.repositories.PatientRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PatientRestController {
    private PatientRepository patientRepository;
    @GetMapping("/patients")
    public List<Patient> patientList(){
        return  patientRepository.findAll();
    }
}