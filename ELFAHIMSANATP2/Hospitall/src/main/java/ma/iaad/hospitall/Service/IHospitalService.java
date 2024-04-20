package ma.iaad.hospitall.Service;

import ma.iaad.hospitall.entities.Consultation;
import ma.iaad.hospitall.entities.Medecin;
import ma.iaad.hospitall.entities.Patient;
import ma.iaad.hospitall.entities.RendezVous;

public interface IHospitalService {
     Patient savePatient(Patient patient);
     Medecin saveMedecin(Medecin medecin);
     RendezVous saveRDV(RendezVous rendezVous);
     Consultation saveConsultation(Consultation consultation);

}
