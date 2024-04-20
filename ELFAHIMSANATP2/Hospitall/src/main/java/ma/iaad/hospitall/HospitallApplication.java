package ma.iaad.hospitall;
import ma.iaad.hospitall.Service.IHospitalService;
import ma.iaad.hospitall.entities.*;
import ma.iaad.hospitall.repositories.ConsultationRepository;
import ma.iaad.hospitall.repositories.MedecinReposirory;
import ma.iaad.hospitall.repositories.PatientRepository;
import ma.iaad.hospitall.repositories.RendezVousRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;
import java.util.stream.Stream;

@SpringBootApplication
public class HospitallApplication {

	public static void main(String[] args) {
		SpringApplication.run(HospitallApplication.class, args);
	}
	@Bean
	CommandLineRunner start(IHospitalService hospitalService, PatientRepository patientRepository, RendezVousRepository rendezVousRepository, ConsultationRepository consultationRepository, MedecinReposirory medecinReposirory){
		return  args -> {
			//Code éxécuté au démarrage
			Stream.of("Sara","Houda","Khalil").forEach(name->{
				Patient patient=new Patient();
				patient.setNom(name);
				patient.setDateNaissance(new Date());
				patient.setMalade(false);
				hospitalService.savePatient(patient);
			});
			Stream.of("kamal","safaa","hicham").forEach(name->{
				Medecin medecin=new Medecin();
				medecin.setNom(name);
				medecin.setEmail(name+"@gmail.com");
				medecin.setSpecialite(Math.random()>0.5?"Cardio":"Dentiste");
				hospitalService.saveMedecin(medecin);
			});

			Patient patient=patientRepository.findById(1L).orElse(null);
			Patient patient1= patientRepository.findByNom("Houda");
			Medecin medecin =medecinReposirory.findByNom("safaa");
			RendezVous rendezVous=new RendezVous();
			rendezVous.setDate(new Date());
			rendezVous.setStatus(StatusRDV.PENDING);
			rendezVous.setPatient(patient);
			rendezVous.setMedecin(medecin);
			RendezVous saveDRDV = hospitalService.saveRDV(rendezVous);
			System.out.println(saveDRDV.getId());


			RendezVous rendezVous1= rendezVousRepository.findAll().get(0);
			Consultation consultation=new Consultation();
			consultation.setDatConsultation(new Date());
			consultation.setRendezVous(rendezVous1);
			consultation.setRapport("rapport de consultation......");
			hospitalService.saveConsultation(consultation);



		};

	}

}
