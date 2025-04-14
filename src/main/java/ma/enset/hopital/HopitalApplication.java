package ma.enset.hopital;

import ma.enset.hopital.entities.Patient;
import ma.enset.hopital.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class HopitalApplication implements CommandLineRunner {


    @Autowired
    private PatientRepository patientRepository;

    public static void main(String[] args) {

        SpringApplication.run(HopitalApplication.class, args);
    }


    //@Override
    public void run(String... args) throws Exception {

        patientRepository.save(new Patient(null, "Oumayma", new Date(), false, 230));
        patientRepository.save(new Patient(null, "Mehdi", new Date(), false, 249));
        patientRepository.save(new Patient(null, "Hajar", new Date(), false, 255));
        patientRepository.save(new Patient(null, "Naima", new Date(), false, 206));
        patientRepository.save(new Patient(null, "Mohammed", new Date(), false, 127));

    }
}
      /*  Patient patient = new Patient();
        patient.setId(1);
        patient.setNom(" Oumayma");
        patient.setDateNaissance(new Date());
        patient.setMalade(false);
        patient.setScore(23);
       */

       //  Patient patient2 = new Patient(null,"Mehdi",new Date(),false,4);


     /*   //En utilisant Builder
        Patient patient3 = Patient.builder()
                .nom("Hajar")
                .dateNaissance(new Date())
                .score(56)
                .malade(false)
                .build(); */

