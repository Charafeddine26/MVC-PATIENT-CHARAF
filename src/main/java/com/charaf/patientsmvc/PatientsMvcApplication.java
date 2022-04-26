package com.charaf.patientsmvc;

import com.charaf.patientsmvc.entities.Medecin;
import com.charaf.patientsmvc.repositories.MedecinRepository;
import com.charaf.patientsmvc.repositories.PatientRepository;
import com.charaf.patientsmvc.sec.service.SecurityService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.Date;

@SpringBootApplication
public class PatientsMvcApplication {

    public static void main(String[] args) {

        SpringApplication.run(PatientsMvcApplication.class, args);
    }

    @Bean
    PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }
    //@Bean
    /*CommandLineRunner commandLineRunner(PatientRepository patientRepository){
        return args -> {
            patientRepository.save(new Patient(null,"Hassan",new Date(),false,312));
            patientRepository.save(new Patient(null,"Simo",new Date(),true,432));
            patientRepository.save(new Patient(null,"Douaa",new Date(),true,540));
            patientRepository.save(new Patient(null,"Hanae",new Date(),true,222));
            patientRepository.findAll().forEach(patient->{
                System.out.println(patient.getNom());
            });
        };
    }*/
    //@Bean
    CommandLineRunner commandLineRunner(MedecinRepository medecinRepository){
        return args -> {
            medecinRepository.save(new Medecin(null,"Medecin1",new Date(),false,31312312));
            medecinRepository.save(new Medecin(null,"Medecin2",new Date(),true,43432432));
            medecinRepository.save(new Medecin(null,"Medecin3",new Date(),true,54040540));
            medecinRepository.save(new Medecin(null,"Medecin4",new Date(),true,22222222));
            medecinRepository.findAll().forEach(patient->{
                System.out.println(patient.getNom());
            });
        };
    }
    //@Bean
     CommandLineRunner saveUsers(SecurityService securityService){
        return args -> {
            securityService.saveNewUser("mohamed1", "1234", "1234");
            securityService.saveNewUser("yasmine1", "1234", "1234");
            securityService.saveNewUser("hassan1", "1234", "1234");

            securityService.saveNewRole("USER","");
            securityService.saveNewRole("ADMIN","");

            securityService.addRoleToUser("mohamed1","USER");
            securityService.addRoleToUser("mohamed1","ADMIN");
            securityService.addRoleToUser("yasmine1","USER");
            securityService.addRoleToUser("hassan1","USER");
        };
    }
}
