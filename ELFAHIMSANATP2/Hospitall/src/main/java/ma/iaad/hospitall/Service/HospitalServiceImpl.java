package ma.iaad.hospitall.Service;

import jakarta.transaction.Transactional;
import ma.iaad.hospitall.entities.Consultation;
import ma.iaad.hospitall.entities.Medecin;
import ma.iaad.hospitall.entities.Patient;
import ma.iaad.hospitall.entities.RendezVous;
import ma.iaad.hospitall.repositories.ConsultationRepository;
import ma.iaad.hospitall.repositories.MedecinReposirory;
import ma.iaad.hospitall.repositories.PatientRepository;
import ma.iaad.hospitall.repositories.RendezVousRepository;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@Transactional
public class HospitalServiceImpl implements IHospitalService {

    private PatientRepository patientRepository;
    private MedecinReposirory medecinReposirory;
    private RendezVousRepository rendezVousRepository;
    private ConsultationRepository consultationRepository;

    public HospitalServiceImpl(PatientRepository patientRepository, MedecinReposirory medecinReposirory, RendezVousRepository rendezVousRepository, ConsultationRepository consultationRepository) {
        this.patientRepository = patientRepository;
        this.medecinReposirory = medecinReposirory;
        this.rendezVousRepository = rendezVousRepository;
        this.consultationRepository = consultationRepository;
    }


    @Override
    public Patient savePatient(Patient patient) {
         return patientRepository.save(patient);
    }

    @Override
    public Medecin saveMedecin(Medecin medecin) {
        return medecinReposirory.save(medecin);
    }

    @Override
    public RendezVous saveRDV(RendezVous rendezVous) {
        rendezVous.setId(UUID.randomUUID().toString());
        return rendezVousRepository.save(rendezVous);
    }



    @Override
    public Consultation saveConsultation(Consultation consultation) {
        return consultationRepository.save(consultation);
    }
}
