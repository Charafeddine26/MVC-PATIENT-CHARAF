package com.charaf.patientsmvc.repositories;

import com.charaf.patientsmvc.entities.Medecin;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;


public interface MedecinRepository extends JpaRepositoryImplementation<Medecin,Long> {
    Page<Medecin> findByNomContains(String kw, Pageable pageable);
    /*Page<Patient> findByScoreContains(int kw, Pageable pageable);
    Page<Patient> findByIdContains(String kw, Pageable pageable);*/
}
